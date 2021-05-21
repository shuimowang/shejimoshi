public class SubMealBuilderB extends MealBuilder {
	//具体建造者
	public void buildFood() {
		meal.setFood("一个鸡肉卷");
	}
	public void buildDrink() {
		meal.setDrink("一杯果汁");
	}
}