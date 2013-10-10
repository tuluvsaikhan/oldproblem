public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(testForSum(new int[]{5,1,23,21,17,2,3,9,12}, 22));
	}
    static boolean testForSum(int[] intArr, int testInt){
    	for (int i=0; i<intArr.length; i++){
    		for (int j=0; j<intArr.length; j++){
    			for (int k=0; k<intArr.length; k++){
    				if (intArr[i]+intArr[j]+intArr[k]==testInt&&i!=j&&j!=k&&i!=k){
    					System.out.println(intArr[i]+ " "+intArr[j]+" "+ intArr[k]+i+j+k);
    					return true;
    				}
    			}
    		}
    	}
    	return false;
    }
}
