package din.java.test;


public class FirstLast {


	public static void main(String[] args) {
		int input =  10012 ;
		//int input =  0000 ;
		System.out.println("Input : "+input);
		System.out.println("output: "+Solution.solution(input));
	}

	static class Solution {
		public static int solution(int input) {			
			if(input>0)
			{
				int[] B =inttoarray(input);
				input = firstlastconcat(B);
			}
			return input;
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

		private static int firstlastconcat(int[] array) {
			int out = 0,finalout = 0;
			int lastPosition = array.length-1;
			int firstElement = array[0],
					lastElement  = array[lastPosition];
			out = firstlastelementconcate(firstElement, lastElement);
			finalout = firstlastelementconcate(finalout, out);
			for (int second = 1; second < array.length/2; second++) {
				//update
				firstElement = array[second];
				lastPosition = lastPosition-1;
				lastElement  = array[lastPosition];

				out = firstlastelementconcate(firstElement, lastElement);
				finalout = finalout * 100 + out;
			}
			if(array.length % 2 == 0){ //if array length is even return as it is.
				return finalout;
			}else{			
				int middle = array.length/2;
				return firstlastelementconcate(finalout, array[middle]); // if array length is odd concatenate middle element
			}
		}

		private static int firstlastelementconcate(int firstElement,
				int lastElement) {
			return firstElement * 10  +  lastElement;
		}
	}
}
