package FrontEnd.IR;

import FrontEnd.AST.ASTBaseNode;
import FrontEnd.AST.ASTVisitor;
import FrontEnd.AST.DefNodeSet.BaseDefNode;
import FrontEnd.AST.DefNodeSet.ClassDefNode;
import FrontEnd.AST.DefNodeSet.FuncDefNode;
import FrontEnd.AST.DefNodeSet.VarDefNode;
import FrontEnd.AST.ExprNodeSet.*;
import FrontEnd.AST.ExprNodeSet.ConstExprNode.ConstBoolExprNode;
import FrontEnd.AST.ExprNodeSet.ConstExprNode.ConstIntExprNode;
import FrontEnd.AST.ExprNodeSet.ConstExprNode.ConstStringExprNode;
import FrontEnd.AST.ExprNodeSet.ConstExprNode.NullExprNode;
import FrontEnd.AST.OtherNodeSet.ClassConstructorNode;
import FrontEnd.AST.OtherNodeSet.ParaDataListNode;
import FrontEnd.AST.OtherNodeSet.ParaListNode;
import FrontEnd.AST.RootNode;
import FrontEnd.AST.StatNodeSet.*;
import FrontEnd.AST.TypeNodeSet.*;
import FrontEnd.IR.Basic.Value;
import FrontEnd.IR.BasicBlock.IRBasicBlock;
import FrontEnd.IR.Const.*;
import FrontEnd.IR.Function.IRFunction;
import FrontEnd.IR.GlobalVarDef.GlobalVarDef;
import FrontEnd.IR.Instruction.*;
import FrontEnd.IR.Module.IRModule;
import FrontEnd.IR.TypeSystem.BaseType;
import FrontEnd.IR.TypeSystem.FunctionType;
import FrontEnd.IR.TypeSystem.OperandType.*;
import FrontEnd.IR.Utils.IRScope;
import FrontEnd.SemanticCheck.Utils.GlobalScope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IRBuilder extends ASTVisitor<Void> {
	public IRModule irModule=new IRModule();

	IRFunction currentFunction=null;
	IRBasicBlock currentBlock=null;

	IRScope irCurrentScope=new IRScope(null);

	GlobalScope semanticGlobalScope;
	ClassDefNode astCurrentClass=null;

	ArrayList<VarDefNode> globalVarInitList;

	boolean isInClass=false;
	StructType currentclass=null;

	String currentfunctionname;

	Stack<IRBasicBlock> continueStack=new Stack<>();
	Stack<IRBasicBlock> breakStack=new Stack<>();



	public IRBuilder(GlobalScope _semanticGlobalScope){
		semanticGlobalScope=_semanticGlobalScope;
	}
	@Override
	public Void visitRoot(RootNode node){
		//builtin function is contained in semanticGlobalScope.function_table
		//void print(string str);		//string->i8*
		//void println(string str);		//string->i8*
		//void printInt(int n);			//int->i32
		//void printlnInt(int n);		//int->i32
		//string getString();			//string->i8*
		//int getInt();					//int->i32
		//string toString(int i);		//int->i32
		IRFunction tmpfunc;
		ArrayList<Value> tmppara;
		ArrayList<BaseType> tmpparatype;
		for (HashMap.Entry<String,FuncDefNode> entry: semanticGlobalScope.function_table.entrySet()) {
			FuncDefNode tmp=entry.getValue();
			tmppara=new ArrayList<>();
			tmpparatype=new ArrayList<>();
			for(int i=0;i<tmp.paralist.paralist.size();i++){
				tmppara.add(new Value(tmp.paralist.paralist.get(i).varname,transType(tmp.paralist.paralist.get(i).vartype)));
			}
			for(int i=0;i<tmppara.size();i++){
				tmpparatype.add(tmppara.get(i).type);
			}
			tmpfunc=new IRFunction("f_"+tmp.funcname,new FunctionType(transType(tmp.returntype),tmpparatype),tmppara,tmp.block==null);
			irModule.funcHashMap.put("f_"+tmp.funcname,tmpfunc);
		}

		//function declare for string compare
		//bool _stringcmp_eq(string a,string b)			//string->i8*,bool->i1
		//bool _stringcmp_neq(string a,string b)			//string->i8*,bool->i1
		//bool _stringcmp_less(string a,string b)		//string->i8*,bool->i1
		//bool _stringcmp_greater(string a,string b)		//string->i8*,bool->i1
		//bool _stringcmp_leq(string a,string b)			//string->i8*,bool->i1
		//bool _stringcmp_geq(string a,string b)			//string->i8*,bool->i1
		//string _string_merge(string a,string b)			//string->i8*
		generate_stringcmp("_stringcmp_eq");
		generate_stringcmp("_stringcmp_neq");
		generate_stringcmp("_stringcmp_less");
		generate_stringcmp("_stringcmp_greater");
		generate_stringcmp("_stringcmp_leq");
		generate_stringcmp("_stringcmp_geq");
		generate_stringmerge("_string_merge");


//		declare i8* @_malloc(i32 %n)
		{
			tmppara=new ArrayList<>();
			tmpparatype=new ArrayList<>();
			tmppara.add(new Value("n",new IntegerType(32)));
			for(int i=0;i<tmppara.size();i++){
				tmpparatype.add(tmppara.get(i).type);
			}
			tmpfunc=new IRFunction("_malloc",new FunctionType(new PointerType(new IntegerType(8)),tmpparatype),tmppara,true);
			irModule.funcHashMap.put("_malloc",tmpfunc);
		}


//		{
//			tmppara=new ArrayList<>();
//			tmpparatype=new ArrayList<>();
//			tmppara.add(new Value("str",new PointerType(new IntegerType(8))));
//			for(int i=0;i<tmppara.size();i++){
//				tmpparatype.add(tmppara.get(i).type);
//			}
//			tmpfunc=new IRFunction("print",new FunctionType(new VoidType(),tmpparatype),tmppara,true);
//			irModule.funcHashMap.put("print",tmpfunc);
//			irModule.externalFunctionList.add(tmpfunc);
//		}
//		{
//			tmppara=new ArrayList<>();
//			tmpparatype=new ArrayList<>();
//			tmppara.add(new Value("str",new PointerType(new IntegerType(8))));
//			for(int i=0;i<tmppara.size();i++){
//				tmpparatype.add(tmppara.get(i).type);
//			}
//			tmpfunc=new IRFunction("println",new FunctionType(new VoidType(),tmpparatype),tmppara,true);
//			irModule.funcHashMap.put("println",tmpfunc);
//			irModule.externalFunctionList.add(tmpfunc);
//		}
//		{
//			tmppara=new ArrayList<>();
//			tmpparatype=new ArrayList<>();
//			tmppara.add(new Value("n",new IntegerType(32)));
//			for(int i=0;i<tmppara.size();i++){
//				tmpparatype.add(tmppara.get(i).type);
//			}
//			tmpfunc=new IRFunction("printInt",new FunctionType(new VoidType(),tmpparatype),tmppara,true);
//			irModule.funcHashMap.put("printInt",tmpfunc);
//			irModule.externalFunctionList.add(tmpfunc);
//		}
//		{
//			tmppara=new ArrayList<>();
//			tmpparatype=new ArrayList<>();
//			tmppara.add(new Value("n",new IntegerType(32)));
//			for(int i=0;i<tmppara.size();i++){
//				tmpparatype.add(tmppara.get(i).type);
//			}
//			tmpfunc=new IRFunction("printlnInt",new FunctionType(new VoidType(),tmpparatype),tmppara,true);
//			irModule.funcHashMap.put("printlnInt",tmpfunc);
//			irModule.externalFunctionList.add(tmpfunc);
//		}
//		{
//			tmppara=new ArrayList<>();
//			tmpparatype=new ArrayList<>();
//			tmpfunc=new IRFunction("getString",new FunctionType(new PointerType(new IntegerType(8)),tmpparatype),tmppara,true);
//			irModule.funcHashMap.put("getString",tmpfunc);
//			irModule.externalFunctionList.add(tmpfunc);
//		}
//		{
//			tmppara=new ArrayList<>();
//			tmpparatype=new ArrayList<>();
//			tmpfunc=new IRFunction("getInt",new FunctionType(new IntegerType(32),tmpparatype),tmppara,true);
//			irModule.funcHashMap.put("getInt",tmpfunc);
//			irModule.externalFunctionList.add(tmpfunc);
//		}
//		{
//			tmppara=new ArrayList<>();
//			tmpparatype=new ArrayList<>();
//			tmppara.add(new Value("i",new IntegerType(32)));
//			for(int i=0;i<tmppara.size();i++){
//				tmpparatype.add(tmppara.get(i).type);
//			}
//			tmpfunc=new IRFunction("toString",new FunctionType(new PointerType(new IntegerType(8)),tmpparatype),tmppara,true);
//			irModule.funcHashMap.put("toString",tmpfunc);
//			irModule.externalFunctionList.add(tmpfunc);
//		}

		//class def
		for (HashMap.Entry<String,ClassDefNode> entry: semanticGlobalScope.class_table.entrySet()) {
			ClassDefNode tmpclass = entry.getValue();
			irModule.structHashMap.put(tmpclass.classname, new StructType(tmpclass.classname));
		}
		for (HashMap.Entry<String,ClassDefNode> entry: semanticGlobalScope.class_table.entrySet()) {
			ClassDefNode tmpclass=entry.getValue();
			StructType structType=irModule.structHashMap.get(tmpclass.classname);
			for (HashMap.Entry<String,VarDefNode> entry2: tmpclass.varHashmap.entrySet()) {
				VarDefNode tmp2=entry2.getValue();
				BaseType type=transType(tmp2.vartype);
				if(type instanceof StructType)structType.addMember(new PointerType(type));
				else structType.addMember(type);
			}

		}

		//class function def
		for (HashMap.Entry<String,ClassDefNode> entry: semanticGlobalScope.class_table.entrySet()) {
			ClassDefNode tmpclass = entry.getValue();
			BaseType structtype=irModule.structHashMap.get(tmpclass.classname);
			for (Map.Entry<String, FuncDefNode> entry2: tmpclass.funcHashmap.entrySet()) {
				FuncDefNode tmp=entry2.getValue();
				tmppara=new ArrayList<>();
				tmpparatype=new ArrayList<>();
				tmppara.add(new Value("this",new PointerType(structtype)));
				for(int i=0;i<tmp.paralist.paralist.size();i++){
					tmppara.add(new Value(tmp.paralist.paralist.get(i).varname,transType(tmp.paralist.paralist.get(i).vartype)));
				}
				for(int i=0;i<tmppara.size();i++){
					tmpparatype.add(tmppara.get(i).type);
				}
				tmpfunc=new IRFunction("class_f_"+tmpclass.classname+"."+tmp.funcname,new FunctionType(transType(tmp.returntype),tmpparatype),tmppara,tmp.block==null);
				irModule.funcHashMap.put("class_f_"+tmpclass.classname+"."+tmp.funcname,tmpfunc);
			}
		}

		//class constructor def
		//class constructor with parameter is not supported in this compiler
		for (HashMap.Entry<String,ClassDefNode> entry: semanticGlobalScope.class_table.entrySet()) {
			ClassDefNode tmpclass = entry.getValue();
			tmppara=new ArrayList<>();
			tmpparatype=new ArrayList<>();
			BaseType structtype=irModule.structHashMap.get(tmpclass.classname);
			tmppara.add(new Value("this",new PointerType(structtype)));
			for(int i=0;i<tmppara.size();i++){
				tmpparatype.add(tmppara.get(i).type);
			}
			tmpfunc=new IRFunction("class_constructor_"+tmpclass.classname+"."+ tmpclass.classname,new FunctionType(new VoidType(),tmpparatype),tmppara,false);
			irModule.funcHashMap.put("class_constructor_"+tmpclass.classname+"."+ tmpclass.classname,tmpfunc);
		}

		//遍历整棵树
		for(int i=0;i<node.deflist.size();i++){
			BaseDefNode tmp=node.deflist.get(i);
			if(tmp instanceof FuncDefNode) currentfunctionname="f_"+((FuncDefNode) tmp).funcname;
			visit(node.deflist.get(i));
			if(tmp instanceof FuncDefNode) currentfunctionname=null;
		}

		//function void _main_initial() for assigning initial value to global variable
		generate_main_initial();

		return null;
	}

	@Override
	public Void visitVarDef(VarDefNode node){
		//global Variable
		if(irCurrentScope.parent==null){
			GlobalVarDef tmp=new GlobalVarDef(node.varname,transType(node.vartype));
			irModule.globalVarList.add(tmp);
			irCurrentScope.varHashMap.put(node.varname,tmp);
			if(node.initvalue!=null)globalVarInitList.add(node);
		}
		//local Variable
		else {
			AllocInst allocaddr=new AllocInst(node.varname,transType(node.vartype),currentBlock);
			irCurrentScope.varHashMap.put(node.varname,allocaddr);
			if(node.initvalue!=null){
				visit(node.initvalue);
				if(node.initvalue.irOperand instanceof ConstString){
					Value addr2=creat_and_getConstString((ConstString) node.initvalue.irOperand);//addr2 i8*
					new StoreInst(allocaddr,addr2,currentBlock);//allocaddr i8**
				}
				else {
					new StoreInst(allocaddr,node.initvalue.irOperand,currentBlock);
				}
			}
		}
		return null;
	}
	@Override
	public Void visitFuncDef(FuncDefNode node){
		irCurrentScope=new IRScope(irCurrentScope);
		currentFunction=irModule.funcHashMap.get(currentfunctionname);
		currentBlock=new IRBasicBlock("normal_block",currentFunction);
		if(currentfunctionname.equals("f_main")){
			IRFunction initfunc=irModule.funcHashMap.get("_main_initial");
			new CallInst(initfunc,new ArrayList<>(),currentBlock);
		}
		visit(node.block);
		currentFunction=null;
		currentBlock=null;
		irCurrentScope=irCurrentScope.parent;
		return null;
	}
	@Override
	public Void visitClassDef(ClassDefNode node){
		irCurrentScope=new IRScope(irCurrentScope);
		isInClass=true;
		currentclass=irModule.structHashMap.get(node.classname);
		for (HashMap.Entry<String,FuncDefNode> entry: node.funcHashmap.entrySet()) {
			FuncDefNode tmp=entry.getValue();
			currentfunctionname="class_f_"+node.classname+"."+tmp.funcname;
			visit(tmp);
			currentfunctionname=null;
		}
		for(int i=0;i<node.classconstructorList.size();i++){
			ClassConstructorNode tmp=node.classconstructorList.get(i);
			if(tmp.paralist.paralist.size()!=0)continue;// not support class constructor with parameter
			currentfunctionname="class_constructor_"+node.classname+"."+ node.classname;
			visit(tmp);
			currentfunctionname=null;
		}
		isInClass=false;
		irCurrentScope=irCurrentScope.parent;
		return null;
	}
	@Override
	public Void visitClassConstructor(ClassConstructorNode node){
		irCurrentScope=new IRScope(irCurrentScope);
		currentFunction=irModule.funcHashMap.get(currentfunctionname);
		currentBlock=new IRBasicBlock("normal_block",currentFunction);
		visit(node.block);
		currentFunction=null;
		currentBlock=null;
		irCurrentScope=irCurrentScope.parent;
		return null;
	}
	@Override
	public Void visitParaList(ParaListNode node){
		return null;
	}
	@Override
	public Void visitParaDataList(ParaDataListNode node){
		return null;
	}

	@Override
	public Void visitBlockStat(BlockStatNode node){
		irCurrentScope=new IRScope(irCurrentScope);
		for(int i=0;i<node.statlist.size();i++){
			visit(node.statlist.get(i));
		}
		irCurrentScope=irCurrentScope.parent;
		return null;
	}
	@Override
	public Void visitExprStat(ExprStatNode node){
		visit(node.expr);
		return null;
	}
	@Override
	public Void visitVarDefStat(VarDefStatNode node){
		for(int i=0;i<node.vardeflist.size();i++){
			visit(node.vardeflist.get(i));
		}
		return null;
	}
	@Override
	public Void visitBreakStat(BreakStatNode node){
		new BrInst(null,breakStack.peek(),null,currentBlock);
		return null;
	}
	@Override
	public Void visitContinueStat(ContinueStatNode node){
		new BrInst(null,continueStack.peek(),null,currentBlock);
		return null;
	}
	@Override
	public Void visitReturnStat(ReturnStatNode node){
		if(node.returnexpr!=null){
			visit(node.returnexpr);
			if(node.returnexpr.irOperand instanceof ConstString){
				Value addr2=creat_and_getConstString((ConstString) node.returnexpr.irOperand);
				new RetInst(addr2,currentBlock);
			}
			else {
				new RetInst(node.returnexpr.irOperand,currentBlock);
			}
		}
		else {
			new RetInst(new ConstNull(),currentBlock);
		}
		return null;
	}
	@Override
	public Void visitIfStat(IfStatNode node){
		boolean haveelse=(node.elsestat.statlist.size() != 0);
		IRBasicBlock ifbodyblock=new IRBasicBlock("if_body_begin_block",currentFunction);
		IRBasicBlock elsebodyblock=new IRBasicBlock("else_body_begin_block",haveelse?currentFunction:null);
		IRBasicBlock endifblock=new IRBasicBlock("normal_block",currentFunction);

		visit(node.conditionexpr);
		Value condition=node.conditionexpr.irOperand;
		new BrInst(condition,ifbodyblock,haveelse?elsebodyblock:endifblock,currentBlock);

		irCurrentScope=new IRScope(irCurrentScope);
		currentBlock=ifbodyblock;
		visit(node.ifstat);
		new BrInst(null,endifblock,null,currentBlock);
		irCurrentScope=irCurrentScope.parent;

		if(haveelse){
			irCurrentScope=new IRScope(irCurrentScope);
			currentBlock=elsebodyblock;
			visit(node.elsestat);
			new BrInst(null,endifblock,null,currentBlock);
			irCurrentScope=irCurrentScope.parent;
		}

		currentBlock=endifblock;

		return null;
	}
	@Override
	public Void visitWhileStat(WhileStatNode node){
		IRBasicBlock conditionblock=new IRBasicBlock("while_condition_begin_block",currentFunction);
		IRBasicBlock whilebodyblock=new IRBasicBlock("while_body_begin_block",currentFunction);
		IRBasicBlock endwhileblock=new IRBasicBlock("normal_block",currentFunction);

		new BrInst(null,conditionblock,null,currentBlock);

		irCurrentScope=new IRScope(irCurrentScope);

		currentBlock=conditionblock;
		visit(node.conditionexpr);
		Value condition=node.conditionexpr.irOperand;
		new BrInst(condition,whilebodyblock,endwhileblock,currentBlock);

		continueStack.push(conditionblock);
		breakStack.push(endwhileblock);

		currentBlock=whilebodyblock;
		visit(node.whilestat);
		new BrInst(null,conditionblock,null,currentBlock);

		continueStack.pop();
		breakStack.pop();

		irCurrentScope=irCurrentScope.parent;

		currentBlock=endwhileblock;

		return null;
	}
	@Override
	public Void visitForStat(ForStatNode node){
		IRBasicBlock conditionblock=new IRBasicBlock("for_condition_begin_block",currentFunction);
		IRBasicBlock forbodyblock=new IRBasicBlock("for_body_begin_block",currentFunction);//contain updateblock
		IRBasicBlock endforblock=new IRBasicBlock("normal_block",currentFunction);

		irCurrentScope=new IRScope(irCurrentScope);
		for(int i=0;i<node.initexprlist.size();i++){
			visit(node.initexprlist.get(i));
		}
		new BrInst(null,conditionblock,null,currentBlock);

		irCurrentScope=new IRScope(irCurrentScope);
		currentBlock=conditionblock;
		visit(node.conditionexpr);
		Value condition=node.conditionexpr.irOperand;
		new BrInst(condition,forbodyblock,endforblock,currentBlock);

		continueStack.push(conditionblock);
		breakStack.push(endforblock);

		currentBlock=forbodyblock;
		visit(node.forstat);
		visit(node.updateexpr);
		new BrInst(null,conditionblock,null,currentBlock);

		continueStack.pop();
		breakStack.pop();

		irCurrentScope=irCurrentScope.parent;


		irCurrentScope=irCurrentScope.parent;

		currentBlock=endforblock;

		return null;
	}


	@Override
	public Void visitConstIntExpr(ConstIntExprNode node){
		node.irOperand=new ConstInt(node.value);
		return null;
	}
	@Override
	public Void visitConstBoolExpr(ConstBoolExprNode node){
		node.irOperand=new ConstBool(node.value);
		return null;
	}
	@Override
	public Void visitConstStringExpr(ConstStringExprNode node){
		node.irOperand=new ConstString(node.value);
		return null;
	}
	@Override
	public Void visitNullExpr(NullExprNode node){
		node.irOperand=new ConstNull();
		return null;
	}
	@Override
	public Void visitIdExpr(IdExprNode node){
		return null;
	}
	@Override
	public Void visitArrayExpr(ArrayExprNode node){
		return null;
	}
	@Override
	public Void visitMemberExpr(MemberExprNode node){
		return null;
	}
	@Override
	public Void visitThisExpr(ThisExprNode node){
		return null;
	}
	@Override
	public Void visitNewformatExpr(NewformatExprNode node){
		return null;
	}
	@Override
	public Void visitFuncExpr(FuncExprNode node){
		return null;
	}
	@Override
	public Void visitSingleExpr(SingleExprNode node){
		return null;
	}
	@Override
	public Void visitBinaryExpr(BinaryExprNode node){
		visit(node.operand1);
		visit(node.operand2);
		Value value1=node.operand1.irOperand;
		Value value2=node.operand2.irOperand;
		if(node.op== BinaryExprNode.BinaryOp.LOGIC_AND || node.op== BinaryExprNode.BinaryOp.LOGIC_OR){

			return null;
		}
		BinaryOp op=transOp(node.op);
		if( node.op== BinaryExprNode.BinaryOp.ADD && (node.operand1.returntype instanceof StringTypeNode) ){
			if((value1 instanceof ConstString) && (value2 instanceof ConstString)){
				node.irOperand=new ConstString(((ConstString) value1).value+((ConstString) value2).value);
			}
			else {
				Value addr1,addr2;
				if(value1 instanceof ConstString)addr1=creat_and_getConstString((ConstString) value1);
				else addr1=value1;
				if(value2 instanceof ConstString)addr2=creat_and_getConstString((ConstString) value2);
				else addr2=value2;
				IRFunction callfunc=irModule.funcHashMap.get("_string_merge");
				ArrayList<Value> paradata=new ArrayList<>();
				paradata.add(addr1);
				paradata.add(addr2);
				node.irOperand=new CallInst(callfunc,paradata,currentBlock);
			}
			return null;
		}
		if(node.op== BinaryExprNode.BinaryOp.EQ || node.op== BinaryExprNode.BinaryOp.NEQ){

			return null;
		}
//		else if(isCompareOp(node.op) && (node.operand1.returntype instanceof StringTypeNode)){
//
//		}
//		else {//int
//			if(isCompareOp(node.op)){
//
//			}
//			else {
//
//			}
//		}
		return null;
	}
	@Override
	public Void visitAssignExpr(AssignExprNode node){
		return null;
	}
	@Override
	public Void visitLambdaExpr(LambdaExprNode node){
		return null;
	}

	@Override
	public Void visitIntType(IntTypeNode node){
		return null;
	}
	@Override
	public Void visitBoolType(BoolTypeNode node){
		return null;
	}
	@Override
	public Void visitStringType(StringTypeNode node){
		return null;
	}
	@Override
	public Void visitNullType(NullTypeNode node){
		return null;
	}
	@Override
	public Void visitClassType(ClassTypeNode node){
		return null;
	}
	@Override
	public Void visitArrayType(ArrayTypeNode node){
		return null;
	}
	@Override
	public Void visitVoidType(VoidTypeNode node){
		return null;
	}

	BaseType transType(BaseTypeNode type){//astType->irType
		if(type instanceof IntTypeNode)return new IntegerType(32);
		else if(type instanceof BoolTypeNode)return new IntegerType(1);
		else if(type instanceof StringTypeNode)return new PointerType(new IntegerType(8));
		else if(type instanceof ClassTypeNode)return irModule.structHashMap.get(type.typename);
		else if(type instanceof ArrayTypeNode){
			if(type.typename.equals("int"))return new PointerType(transType(new IntTypeNode(null)),type.dim);
			else if(type.typename.equals("bool"))return new PointerType(transType(new BoolTypeNode(null)),type.dim);
			else if(type.typename.equals("string"))return new PointerType(transType(new StringTypeNode(null)),type.dim);
			else return new PointerType(transType(new ClassTypeNode(type.typename,null)),type.dim);
		}
		else if(type instanceof VoidTypeNode){
			return new VoidType();
		}
		else { //NullTypeNode
			return null;
		}
	}
	BinaryOp transOp(BinaryExprNode.BinaryOp type){
		if(type== BinaryExprNode.BinaryOp.ADD)return BinaryOp.add;
		else if(type== BinaryExprNode.BinaryOp.SUB)return BinaryOp.sub;
		else if(type== BinaryExprNode.BinaryOp.MUL)return BinaryOp.mul;
		else if(type== BinaryExprNode.BinaryOp.DIV)return BinaryOp.sdiv;
		else if(type== BinaryExprNode.BinaryOp.MOD)return BinaryOp.srem;

		else if(type== BinaryExprNode.BinaryOp.LEFT_SHIFT)return BinaryOp.shl;
		else if(type== BinaryExprNode.BinaryOp.RIGHT_SHIFT)return BinaryOp.ashr;
		else if(type== BinaryExprNode.BinaryOp.AND)return BinaryOp.and;
		else if(type== BinaryExprNode.BinaryOp.OR)return BinaryOp.or;
		else if(type== BinaryExprNode.BinaryOp.XOR)return BinaryOp.xor;
		else if(type== BinaryExprNode.BinaryOp.LESS)return BinaryOp.slt;
		else if(type== BinaryExprNode.BinaryOp.LEQ)return BinaryOp.sle;
		else if(type== BinaryExprNode.BinaryOp.GREATER)return BinaryOp.sgt;
		else if(type== BinaryExprNode.BinaryOp.GEQ)return BinaryOp.sle;
		else if(type== BinaryExprNode.BinaryOp.EQ)return BinaryOp.eq;
		else if(type== BinaryExprNode.BinaryOp.NEQ)return BinaryOp.ne;
		return null;
		//no LOGIC_AND,LOGIC_OR
	}
	void generate_stringcmp(String funcname){
		IRFunction tmpfunc;
		ArrayList<Value> tmppara;
		ArrayList<BaseType> tmpparatype;
		tmppara=new ArrayList<>();
		tmpparatype=new ArrayList<>();
		tmppara.add(new Value("str",new PointerType(new IntegerType(8))));
		tmppara.add(new Value("str",new PointerType(new IntegerType(8))));
		for(int i=0;i<tmppara.size();i++){
			tmpparatype.add(tmppara.get(i).type);
		}
		tmpfunc=new IRFunction(funcname,new FunctionType(new IntegerType(1),tmpparatype),tmppara,true);
		irModule.funcHashMap.put(funcname,tmpfunc);
	}
	void generate_stringmerge(String funcname){
		IRFunction tmpfunc;
		ArrayList<Value> tmppara;
		ArrayList<BaseType> tmpparatype;
		tmppara=new ArrayList<>();
		tmpparatype=new ArrayList<>();
		tmppara.add(new Value("str",new PointerType(new IntegerType(8))));
		tmppara.add(new Value("str",new PointerType(new IntegerType(8))));
		for(int i=0;i<tmppara.size();i++){
			tmpparatype.add(tmppara.get(i).type);
		}
		tmpfunc=new IRFunction(funcname,new FunctionType(new PointerType(new IntegerType(8)),tmpparatype),tmppara,true);
		irModule.funcHashMap.put(funcname,tmpfunc);
	}
	void generate_main_initial(){
		IRFunction tmpfunc=new IRFunction("_main_initial",new VoidType(),new ArrayList<>(),false);
		irModule.funcHashMap.put("_main_initial",tmpfunc);
		irCurrentScope=new IRScope(irCurrentScope);
		currentFunction=tmpfunc;
		currentBlock=new IRBasicBlock("normal_block",currentFunction);
		for(int i=0;i<globalVarInitList.size();i++){
			VarDefNode tmp=globalVarInitList.get(i);
			Value addr=irCurrentScope.variable_Get_FromAll(tmp.varname);
			Value initoperand=tmp.initvalue.irOperand;
			if(initoperand instanceof BaseConst){
//				if(node.initvalue.irOperand instanceof ConstBool);
//				if(node.initvalue.irOperand instanceof ConstInt);
//				if(node.initvalue.irOperand instanceof ConstString);
//				if(node.initvalue.irOperand instanceof ConstNull);

				if(initoperand instanceof ConstString){
					Value addr2=creat_and_getConstString((ConstString) initoperand);//addr2 i8*
					new StoreInst(addr,addr2,currentBlock);//addr i8**
				}
				else {
					new StoreInst(addr,tmp.initvalue.irOperand,currentBlock);
				}
			}
			else if(initoperand instanceof BaseInst){
				visit(tmp.initvalue);
				new StoreInst(addr,tmp.initvalue.irOperand,currentBlock);
				//addr i32*/i1*/structtype**/i8**   ,   tmp.initvalue.irOperand  i32/i1/structtype*/i8*
			}
			else throw new RuntimeException("?? error in generate_main_initial ??");
			currentBlock.addInstruction(new StoreInst(addr,initoperand,null));
		}

		currentFunction=null;
		currentBlock=null;
	}
	GetElementPtrInst creat_and_getConstString(ConstString node){//node [size x i8]* ,  return i8*
		irModule.stringHashList.add(node);
		ArrayList<Value> offset=new ArrayList<>();
		offset.add(new ConstInt(0));
		offset.add(new ConstInt(0));
		return new GetElementPtrInst(node,offset,new PointerType(new IntegerType(8)),currentBlock);
	}
}
