public class Client {
	public static void main(String args[]) {
         try {
         	TV tv;
         	String brandName=XMLUtilTV.getBrandName();
         	tv=TVFactory.produceTV(brandName);
         	//工厂生产电视
         	tv.play();
         	//播放电视
         }
         catch(Exception e) {
         	System.out.println(e.getMessage());
         }
	}
}
