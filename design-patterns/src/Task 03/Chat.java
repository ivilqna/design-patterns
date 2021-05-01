package mediatorsingleton;

import java.util.ArrayList;
import java.util.List;


public class Chat implements MessageMediator {

	private List<User>users;
	private ChatBot chatbot;
	
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

	@Override
	public void sendMessage(String message, User user) {
		
		if(message.contains("Add Bot")){
		this.chatbot = ChatBot.getInstance();	
		System.out.println("Chat Bot is add");
		}
		
		if (chatbot != null) {
			this.users.remove(user);
			if (chatbot.messageControl(message)) {	
				
				for(User chatUser: this.users) {
					if (user !=chatUser) {
						chatUser.receive(message);
					}
				}
			} 
		} 		
	}
	
	public void removeUser(User user) {
		this.users.remove(user);
		
	}
}
