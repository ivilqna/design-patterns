package singleton;

public class Singleton {

	private static Singleton instance;
	
	public Singleton() {
		
	}
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void consumeMassage(String massage) {
		System.out.println("Massage from singleton instance: " + massage);
	}
}
