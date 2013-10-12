
public class Question4 {

	public static void main(String[] args) {
		System.out.println(reverseOf("Hold!"));
	}
	 public static String reverseOf( String s ) {

	      if (s.length() == 0)
	         { return s; }
	      else {
	         int n = s.length();
	         return s.charAt(n-1) + reverseOf( s.substring(0, n-1) );
	      }
	   }  
}
