package FrontEnd.AST.ExprNodeSet.ConstExprNode;

import FrontEnd.AST.ExprNodeSet.BaseExprNode;
import FrontEnd.AST.ASTVisitor;
import Utils.Position;

public class ConstIntExprNode extends BaseExprNode {
	public int value;
	public ConstIntExprNode(int _value, Position _pos){
		super(_pos);
		value=_value;
	}
	@Override
	public <T> T accept(ASTVisitor<T> visitor) {
		return visitor.visitConstIntExpr(this);
	}
}
