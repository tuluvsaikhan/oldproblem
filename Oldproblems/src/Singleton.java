class Singleton
{
	private static Singleton instance;
	private Singleton(){System.out.println("Instantiating...");}

	public static synchronized Singleton getInstance()
	{
		if (instance == null) instance = new Singleton();
		return instance;
	}
	public static void main(String args[]){
		Singleton.getInstance();
	}
	
}