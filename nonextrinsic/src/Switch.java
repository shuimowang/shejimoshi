public class Switch implements NetworkDevice {
	//交换机
	private String type;
	
	public Switch(String type) {
		this.type=type;
	}
	
	public String getType() {
		return this.type;
	} 
	
	public void use() {
		System.out.println("Linked by switch, type is " + this.type);
	}
}