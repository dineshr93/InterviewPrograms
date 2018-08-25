package din.java.test;

public class ArraySort {
public static void main(String[] args) {
	int[] A = new int[]{-8,3,5,1,0,2,-1,-2};
	int[] B = new int[]{-8,3,5,1,0,2,-1,-2};
	System.out.print("Input : ");
	for (int i = 0; i < B.length; i++) {
		System.out.print(B[i]+",");
	}
	System.out.println("\nOutput:\nSmall Element is "+GetSmallElementInArray(A));
	System.out.println("large Element is "+GetLargeElementInArray(B));
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

private static int GetLargeElementInArray(int[] A) {
	int largeElement=0;
	for (int i = 0; i+1 < A.length; i++) {
		if(A[i] > A[i+1]){
			largeElement = A[i];
			A[i+1]= A[i];
		}else{
			largeElement = A[i+1];
		}
	}
	return largeElement;
}
}
