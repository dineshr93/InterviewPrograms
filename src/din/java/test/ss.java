package din.java.test;

public class ss {
public static void main(String[] args) {
	int[] A = new int[]{3,5,1,0,2};
    
	for (int i = 0; i < A.length; i++) {
		
		if(i+1 == A.length)
			break;
		System.out.println("i="+i);
		System.out.println("i+1="+(i+1));
		System.out.println("-----");
		if(A[i] < A[i+1]){
			
			System.out.println(A[i]+" A[i] is small");
		}else System.out.println(A[i+1]+" A[i+1] is small");
		
		System.out.println("============");
		System.out.println("");
	}
	
}
}
