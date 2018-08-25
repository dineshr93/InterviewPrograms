package din.java.test;

public class ArrayToIntandInttoarray {

	public static void main(String[] args) {
		int[] A = new int[]{3,5,1,0,2};
		int number  = arraytoint(A);
		//System.out.println(number);
		int[] B =inttoarray(number);
		/*for (int i = 0; i < B.length; i++) {
			System.out.println("-"+B[i]);
		}*/
	}

	private static int[] inttoarray(int number) {
		int temp = number,
				size = 0;
		//find array size using temp
		do{
			temp = temp/10; // /(divide), one by one deletes the last digit and updates temp
			size = size + 1;
		}while(temp>0);
		//using size create an array
		int[] array = new int[size];
		int arrayslastposition = size-1;
		for (int i = arrayslastposition; i >= 0 ; i--) {
			array[i] = number%10;// %(mod) picks last digit first. So place it in last position of an array
			number = number/10; // /(divide) deletes the last digit and updates
		}
		return array;
	}

	private static int arraytoint(int[] A) {
		int out = A[0];
		for (int i = 0; i+1 < A.length; i++) {
			out = out*10+A[i+1];
		}
		return out;
	}
}
