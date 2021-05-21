public class Client {
	public static void main(String args[]) {
		MealBuilder mb=(MealBuilder)XMLUtil.getBean();
		//动态确定套餐种类
		KFCWaiter waiter=new KFCWaiter();
		//服务员是指挥者
		waiter.setMealBuilder(mb);
		//服务员准备套餐
		Meal meal=waiter.construct();
		//客户获得套餐

		System.out.println("套餐组成：");
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}
}
