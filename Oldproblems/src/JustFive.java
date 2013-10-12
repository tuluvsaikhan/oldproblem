
public class JustFive {
	private static int i=0;
	private JustFive(){}
	private static JustFive getInstance() throws Exception{
		if(i<5) {
			i++;
			System.out.println("Instance created "+i);
			return new JustFive();
		} else
			throw new Exception("Can't create more than 5 instances of this class");
	}
	public static void main(String[] args) throws Exception {
		 getInstance();
		 getInstance();
		 getInstance();
		 getInstance();
		 getInstance();
		 getInstance();
	}
}
//	class Sample
//	{
//	   private static int i = 0;
//
//	   private Sample()
//	   {
//	   } 
//
//	  public static Sample CreateInstance()
//	   {
//	      if(i <5)
//	      {
//	          i++;
//	          return new Sample();
//	      } 
//
//	      else
//	        throw new Exception("Can not create more then 5 instance of this class");  
//	   }
//
//	}

