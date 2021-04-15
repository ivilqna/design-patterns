package observer;

import java.util.ArrayList;
import java.util.List;

public class Massage implements Observable {
	
	private List<Observer> observers;
	private String massage;
	
	public Massage() {
		this.observers= new ArrayList<>();
	}
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setMassage(this);	

	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		}


	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.massage;
	}
	
	public void setMassage(String massage) {
		System.out.println("Message Posted : "+ massage);
		this.massage=massage;
		
		this.notifyObservers();
	}

}
