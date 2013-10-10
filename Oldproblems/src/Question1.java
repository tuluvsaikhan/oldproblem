import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Question1 {

	public static void main(String[] args) {
		String[] words = {"good","better", "best", "best", "first" , "last", "last", "last", "good"};  
		List<String> list = new ArrayList<String>();  
		for (String s : words) {  
		    list.add(s);  
		}  
		removeDuplicates(list);
	}
    static void removeDuplicates(List<String> array){
    	HashSet<String> hs = new HashSet<>();
    	hs.addAll(array);
    	array.clear();
    	array.addAll(hs);
    	for (String x : array){ 
    		System.out.println(x);
    	}
    }
}
