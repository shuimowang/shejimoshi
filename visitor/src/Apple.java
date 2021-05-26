public class Apple implements Product {
    //具体元素
  @Override
  public void accept(Visitor visitor) {
      visitor.visit(this);
  }	
}