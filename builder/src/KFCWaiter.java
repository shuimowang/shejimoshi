public class KFCWaiter {
	//指挥者
	private MealBuilder mb;
	public void setMealBuilder(MealBuilder mb) {
		this.mb=mb;
	}
	public Meal construct() {
		mb.buildFood();
		mb.buildDrink();
		return mb.getMeal();
	}
}