package mediatorsingleton;

public class ChatBot {
	
	private static ChatBot instance;

	public ChatBot() {
		// TODO Auto-generated constructor stub
	}

	public static ChatBot getInstance() {
		
		if(instance==null)
		{
			instance = new ChatBot();
		}
		return instance;
	}
	
	
	public boolean messageControl(String message) {
		if(message.contains("Cat")) {
			System.out.println(message +" is forbidden!");
			System.out.println("User is remove");
			return false;
		}
		return true;
		
	}
	
}
