public abstract class MealBuilder {
	//抽象建造者
	protected Meal meal=new Meal();
	public abstract void buildFood();
	public abstract void buildDrink();
	public Meal getMeal() {
		return meal;
	}
}