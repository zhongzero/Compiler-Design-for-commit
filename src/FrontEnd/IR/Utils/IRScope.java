package FrontEnd.IR.Utils;

import FrontEnd.AST.TypeNodeSet.BaseTypeNode;
import FrontEnd.IR.Basic.Value;
import FrontEnd.SemanticCheck.Utils.Scope;
import Utils.Error.SemanticError;

import java.util.HashMap;

public class IRScope {
	public HashMap<String, Value> varHashMap;
	public IRScope parent;
	public IRScope(IRScope _parent){
		parent=_parent;
		varHashMap=new HashMap<>();
	}
	public Value variable_Get_FromAll(String key){
		IRScope tmp=this;
		while(tmp!=null){
			if(tmp.varHashMap.containsKey(key))return tmp.varHashMap.get(key);
			tmp=tmp.parent;
		}
		throw new RuntimeException("??? IRscope get variable failed ???");
	}
}
