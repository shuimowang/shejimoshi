public class ArrayHandler {
	//环境类
	private Sort sortObj;
	
	public int[] sort(int arr[]) {
		sortObj.sort(arr);
		return arr;
	}

	public void setSortObj(Sort sortObj) {
		this.sortObj = sortObj; 
	}
}