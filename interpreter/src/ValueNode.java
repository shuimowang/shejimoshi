public class ValueNode implements Node {
	//数字节点
	private int value;
	
	public ValueNode(int value) {
		this.value=value;
	}
		
	public int interpret() {
		return this.value;
	}
}