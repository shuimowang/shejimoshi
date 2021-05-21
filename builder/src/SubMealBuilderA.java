public class SubMealBuilderA extends MealBuilder {
	//具体建造者
	public void buildFood() {
		meal.setFood("一个鸡腿堡");
	}
	public void buildDrink() {
		meal.setDrink("一杯可乐");
	}
}