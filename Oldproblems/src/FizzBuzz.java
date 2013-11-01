import java.util.Arrays;


public class FizzBuzz {

	public static void main(String[] args) {
		fizzArray(0);
		fizzArray2(3);
		fizzArray3(5,10);
		fizzBuzz(1,16);
	}
	static void fizzArray(int n){
		int[] newArr = new int[n];
		for(int i:newArr){
			System.out.print(i+", ");
		}
		System.out.println(" .");
	}
	static void fizzArray2(int n){
		String[] newArr = new String[n];
		for(int i=0; i<n; i++){
			newArr[i]=String.valueOf(i);
		}
		for(String str:newArr){
			System.out.println(str+", ");
		}
	}
	static void fizzArray3(int start, int end){
		int[] newArr = new int[end-start];
		for(int i=0;i<end-start;i++){
			newArr[i]=start+i;
		}
		for(int i:newArr){
			System.out.print(i+" - ");
		}
	}
	static void fizzBuzz(int start, int end){
		String[] fb = new String[end-start+1];
		String str;
		for(int i =1; i<end-start+2;i++){
			str = String.valueOf(i);
			if(i%3==0) str = "fizz";
			if(i%5==0) str = "buzz";
			if(i%15==0) str = "fizzBuzz";
			fb[i-1]= str;
		}
		System.out.println(Arrays.toString(fb));
	}
}
