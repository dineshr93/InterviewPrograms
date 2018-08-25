package din.java.test;

public class OddMinElement {

	public static void main(String[] args) {
		//program to find minimum odd number in a array
		int[] A = new int[]{3,5,10,0,2};
		System.out.print("Input : ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+",");
		}
		int[] oddarray = getOddElements(A);
		System.out.println("\nOutput:\nMinimum Odd Element is "+GetSmallElementInArray(oddarray));
	}
	private static int[] getOddElements(int[] a) {
		int size = 0;
		//First compute size for 
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 == 1) {//If odd element
				size  = size +1;
			}
		}
		
		int[] oddArray = new int[size];
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 == 1) {//If odd element
				oddArray[i]  =a[i];
			}
		}
		return oddArray;
	}
	private static int GetSmallElementInArray(int[] A) {
		int smallElement=0;
		for (int i = 0; i+1 < A.length; i++) {
			if(A[i] < A[i+1]){
				smallElement = A[i];
				A[i+1]= A[i];
			}else{
				smallElement = A[i+1];
			}
		}
		return smallElement;
	}
}
