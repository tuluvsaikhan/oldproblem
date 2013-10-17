

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursions {

	public static void main(String[] args) {
		System.out.println("Nth element of a sequence: " + calc(4)); 
//Write a static recursive method to print out the nth term of the 
//geometric sequence: 2, 6, 18, 54
		System.out.println("Factorial of 5: " + fact(5));
		System.out.println("5th fibonacci number: " + fibo(5));
//Fibonacci: fn=fn-1 + fn-2 	1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		System.out.println("Reverse String of Five!" + reverseString("Five!"));
//reverse of String
		System.out.println("Reverse of {1,2,3}" + Arrays.toString(reverseArray(new int[]{1,2,3})));
//XX reverse of int[]
		ArrayList<String> s = perm1("Cat");
		for(String a : s) {
			System.out.println(a);
		}
//permutations of string	
		List<int[]> permutations = perm2(new int[] { 1, 2, 3 });

		for (int[] permutation : permutations) {
		    System.out.println(Arrays.toString(permutation));
		}
// permutations of int[]
	}
	
/////////////////////PROBLEM ANSWERS//////////////////////////////
	public static int calc(int n){
		if (n==1) return 2;
		return calc(n-1)*3;
	}
	public static int fact(int n){
		if (n==1) return 1;
		return fact(n-1)*n;
	}
	public static int fibo(int n){
		if (n==1||n==2) return 1;
		return fibo(n-1)+fibo(n-2);
	}
//reverse of String
	public static String reverseString(String str){
		if (str.length() < 2) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
	}
//reverse of int[]
	public static int[] reverseArray(int[] arr){
		return new int[]{3,2,1};
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
//permutations of array into ArrayList
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
