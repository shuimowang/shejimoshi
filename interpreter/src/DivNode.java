public class DivNode extends SymbolNode {
	// /节点
	public DivNode(Node left,Node right) {
		super(left,right);
	}
	
	public int interpret() {
		return super.left.interpret() / super.right.interpret();
	}
}