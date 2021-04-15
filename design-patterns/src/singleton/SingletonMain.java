package singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton conncection = Singleton.getInstance();
		conncection.consumeMassage("Connected");
	}

}
