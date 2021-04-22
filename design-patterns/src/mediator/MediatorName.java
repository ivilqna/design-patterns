package mediator;

public class MediatorName {

	public static void main(String[] args) {

		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat,"Ivan");
		User user2 = new ChatUser(chat,"Maria");
		User user3 = new ChatUser(chat,"Georgi");
		
		user2.send("Hi,guys");

	}

}
