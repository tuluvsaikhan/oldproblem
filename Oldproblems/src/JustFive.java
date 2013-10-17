import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//
public class JustFive {
	private static int i=0;
	private int id;
	public JustFive(int n){
		this.id=n;
	}
//	public static void main(String[] args) throws Exception {
//		 getInstance();
//		 getInstance();
//		 getInstance();
//		 getInstance();
//		 getInstance();
//	}
	private static JustFive getInstance() throws Exception{
		if(i<5) {
			i++;
			System.out.println(i+" instance created ");
			return new JustFive(i*1000);
		} else
			throw new Exception("Can't create more than 5 instances of this class");
	}
	private int getId(){
		return this.id;
	}
//}
public static void main(String[] args) throws Exception {
    List<JustFive> jfs = Arrays.asList(getInstance(), getInstance(), getInstance(), getInstance(), getInstance());
    Collections.sort(jfs, new Comparator<JustFive>(){
        @Override
        public int compare(JustFive o1, JustFive o2) {
            return -1 * new Integer(o1.id).compareTo(o2.getId());
        }
    });
    for (JustFive justFive : jfs) {
        System.out.println(justFive.getId());
    }
}
}


