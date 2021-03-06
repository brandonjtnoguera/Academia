public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = sumOfArray(myArray, 5);
		System.out.println(sum);
//		for(int x :  myArray){
//			System.out.println(x);
//		}

	}
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static <T extends Number> int sumOfArray(T[] arr, int num) {
		int sum = 0;
		if(num == 1) return (int)arr[num-1];
		else sum = (int)arr[num - 1] + sumOfArray(arr, num - 1);
		return sum;

//		if(num == 0) return 0;
//		return (sumOfArray(arr,num - 1) + arr[num - 1]);
		// Implement your code here
		// add from [5-0]

		//return -999;  // PLACE HOLDER
	}

}