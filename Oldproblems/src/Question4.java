
public class Question4 {
	//main
	public static void main(String[] args) {
		System.out.println("Reverse is: " + reverseOf("Hold!"));
		anag("yes", "");
		System.out.println("Sum of array: " + arraySum(new int[]{5,4,2}));
		System.out.println("Fibonacci: " + fib(9));
		print ("", "help", 2);
	}
	//reverse String
	 public static String reverseOf( String s ) {
	      if (s.length() == 0) return s;
	      else {
	         int n = s.length();
	         return s.charAt(n-1) + reverseOf( s.substring(0, n-1) );
	      }
	}  
	//Sum int[]
	 public static int arraySum(int[] a) { return arraySumAux(a, 0, a.length); }
	 public static int arraySumAux(int[] a, int low, int high) { 
         if (low == high) return 0; 
         else return arraySumAux(a, low, high-1) + a[high-1]; 
      }
	//anagram
	public static void anag(String s1, String s2)	{
				if(s1.length() == 0)	{
					System.out.println(s2);
				}
				for(int i = 0; i < s1.length(); i++)	{
					anag(s1.substring(0, i) + s1.substring(i+1, s1.length()), s1.charAt(i) + s2);
				}
	}
	//Fibonacci
	public static int fib(int n) {
	    if(n <= 1) return n;
	    else return fib(n - 1) + fib(n - 2);
	}
	//Print out all subsequences of the string s of length k
	  public static void print(String prefix, String remaining, int k) {
	        if (k == 0) {
	            System.out.println(prefix);
	            return;
	        }
	        if (remaining.length() == 0) return;
	        print(prefix + remaining.charAt(0), remaining.substring(1), k-1);
	        print(prefix, remaining.substring(1), k);
	    }
}