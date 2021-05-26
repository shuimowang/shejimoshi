public class Book implements Product {
    //具体元素
  @Override
  public void accept(Visitor visitor) {
      visitor.visit(this);
  }	
}