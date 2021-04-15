package observer;

public interface Observer {

	void update();
	void setObservable(Observable observable);
	void setMassage(Observable massage);
}
