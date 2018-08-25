package din.java.test;

public class ArraySort {
public static void main(String[] args) {
	int[] A = new int[]{-8,3,5,1,0,2,-1,-2};
	System.out.println(GetSmallElementInArray(A));
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
