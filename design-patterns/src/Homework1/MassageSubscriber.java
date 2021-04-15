package observer;

public class MassageSubscriber implements Observer {
	
	private String name;
	private Observable massage;
	
	public MassageSubscriber(String name) {
		this.name=name;	}


	@Override
	public void update() {
		String massage = this.massage.getUpdate();
		if(massage == null) {
			System.out.println(name+": No new message");
		}
		else
		System.out.println(name+": New message:"+massage);
	}


	@Override
	public void setMassage(Observable massage) {
		this.massage=massage;
	}


	@Override
	public void setObservable(Observable observable) {

	}
		
}



