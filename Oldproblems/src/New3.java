import java.util.Arrays;


public class New3 {

	public static void main(String[] args) {
	System.out.println("Second largest of array {4,1,2,3} is " + secondLargest(new int[]{4,1,2,3}));
	System.out.println("sumOdd-sumEven of array {4,1,2,3} is "+ diffOddEven(new int[]{4,5,2,3}));
	System.out.println("{'a','b','c'},1,2 :" + Arrays.toString(charF(new char[]{'a','b','c'},1,2)));
	}
	static int secondLargest(int[] a){
		int max1=-1, max2=-1;
		for(int i : a){
			if (max1<i) {
				max2=max1;
				max1=i;
			}
			else if(max2<i&&max1!=i){
				max2=i;
			}
		}
		return max2;
	}
	static int diffOddEven(int[] a){
		int sumOdd=0, sumEven=0;
		for (int i:a){
			if(i%2==0)sumEven+=i;
			else sumOdd+=i;
		}
		return sumOdd-sumEven;
	}
	static char[] charF(char[] a, int start, int len){
		if(start<0||len<0||start + len -1 >=a.length) return null;
		char[] c = new char[len];
		for(int i=start, j=0; j<len; i++, j++){c[j]=a[i];}
		return c;
	}
}
