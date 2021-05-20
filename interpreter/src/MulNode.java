public class MulNode extends SymbolNode {
	// *节点
	public MulNode(Node left,Node right) {
		super(left,right);
	}
	
	public int interpret() {
		return super.left.interpret() * super.right.interpret();
	}
}