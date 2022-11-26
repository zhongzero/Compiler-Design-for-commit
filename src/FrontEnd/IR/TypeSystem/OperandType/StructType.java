package FrontEnd.IR.TypeSystem.OperandType;

import FrontEnd.IR.IRVisitor;
import FrontEnd.IR.TypeSystem.BaseType;

import java.util.ArrayList;

public class StructType extends BaseType {
	public String structname;
	public ArrayList<BaseType> membertype;
	public StructType(String _structname){
		structname=_structname;
		membertype=new ArrayList<>();
	}
	public void addMember(BaseType type){
		membertype.add(type);
	}
	@Override
	public int bytesize(){
		int sum=0;
		for(int i=0;i<membertype.size();i++){
			sum+=membertype.get(i).bytesize();
		}
		return sum;
	}
	@Override
	public boolean isEqual(BaseType other){
		if((other instanceof StructType) && structname.equals(((StructType) other).structname) ) return true;
		else return false;
	}

	@Override
	public String toString(){
		return "%"+structname;
	}

	@Override
	public <T> T accept(IRVisitor<T> visitor) {
		return visitor.visitStructType(this);
	}
}
