import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursions {

	public static void main(String[] args) {
//Write a static recursive method to print out the nth term of the 
//geometric sequence: 2, 6, 18, 54
		System.out.println("Nth element of a sequence: " + calc(4)); 
//Fibonacci: fn=fn-1 + fn-2 	1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		System.out.println("Factorial of 5: " + fact(5));
		System.out.println("5th fibonacci number: " + fibo(5));
//sum of int[]
		System.out.println("Sum of int array {1,2,3,5,15,100} is: " + sum(new int[]{1,2,3,5,15,100}));
//base ^ N
		System.out.println("5 ^ 3 is: " + power(5,3));
//sum of digits
		System.out.println("sum of digits of 25604: "+ sumDigit(25604));
//reverse of String
		System.out.println("Reverse String of Five!" + reverseString("Five!"));
//reverse of int[]
		System.out.println("Reverse of {1,2,3,5,15,100}" + Arrays.toString(reverseArray(new int[]{1,2,3,5,15,100})));
//permutations of string	
		ArrayList<String> s = perm1("Cat");
		for(String a : s) {
			System.out.println(a);
		}
// permutations of int[]
		List<int[]> permutations = perm2(new int[] { 1, 2, 3 });

		for (int[] permutation : permutations) {
		    System.out.println(Arrays.toString(permutation));
		}
	}
	
/////////////////////PROBLEM ANSWERS//////////////////////////////
	public static int calc(int n){    // nth elem of 2, 6, 18, 54 sequence
		if (n==1) return 2;
		return calc(n-1)*3;
	}
	public static int fact(int n){   //factorial
		if (n==1) return 1;
		return fact(n-1)*n;
	}
	public static int fibo(int n){   //fibonacci
		if (n==1||n==2) return 1;
		return fibo(n-1)+fibo(n-2);
	}
	public static int sum(int[] a){        // sum of int[]
		int len = a.length;
		return sum(a, len);
	}
	public static int sum(int[] a, int len){
		if (len==1) return a[0];
		return sum(a, len-1)+a[len-1];
	}
	public static int power(int base, int n){     //5 ^ 3
		if(n==1) return base;
		return power(base, n-1)*base;
	}
	public static int sumDigit(int a){            //sum of digits
		if (a/10==0) return a;
		return a%10+sumDigit(a/10);
	}
//reverse of String
	public static String reverseString(String str){
		if (str.length() < 2) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
	}
//reverse of int[]
	public static int[] reverseArray(int[] x){
		return reverse(x, 0, x.length -1);
	}

	static int[] reverse(int[] x, int i, int j){
		if(i<j){//Swap
			int tmp = x[i];
			x[i] = x[j];
			x[j] = tmp;
			return reverse(x, ++i, --j);//Recursive
		}  else return x;
	}
//permutations of String
	private static ArrayList<String> perm1(String s){
		ArrayList<String> result= new ArrayList<>();
		perm1(result, "", s);
		return result;
	}
	private static void perm1(ArrayList<String> results, String prefix, String s) {
        int N = s.length();
        if (N == 0) results.add(prefix);
        else {
            for (int i = 0; i < N; i++)
               perm1(results, prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N));
        }
    }
//permutations of array, return ArrayList
	public static List<int[]> perm2(int[] s) {
	    List<int[]> permutations = new ArrayList<>();
	    perm2(permutations, s, s.length);
	    return permutations;
	}
	private static void perm2(List<int[]> permutations, int[] a, int n) {
	    if (n == 1) {
	        permutations.add(a.clone());
	        return;
	    }
	    for (int i = 0; i < n; i++) {
	        swap(a, i, n-1);
	        perm2(permutations, a, n-1);
	        swap(a, i, n-1);
	    }
	} 
	private static void swap(int[] a, int i, int j) {
	    int c;
	    c = a[i]; a[i] = a[j]; a[j] = c;
	}
	

}
