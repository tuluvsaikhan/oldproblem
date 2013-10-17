class Singleton
{
	private static int id=1;
	private static Singleton instance;
	private Singleton(){System.out.println("Initializing...");}

	public static synchronized Singleton getInstance()
	{
		if (instance == null)
			instance = new Singleton();

		return instance;
	}
	static int getId(){
		return Singleton.id;
	}
	public static void main(String args[]){
		Singleton.getInstance();
		System.out.println(Singleton.getId()+ " object(s) created");
	}
	
}