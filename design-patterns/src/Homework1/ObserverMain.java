package observer;

public class ObserverMain {

	public static void main(String[] args) {
		Massage massage = new Massage();
		
		Observer obs1 = new MassageSubscriber("Reader 01");
		Observer obs2 = new MassageSubscriber("Reader 02");
		Observer obs3 = new MassageSubscriber("Reader 03");

		massage.subscribe(obs1);
		massage.subscribe(obs2);
		massage.subscribe(obs3);
		
		obs1.setMassage(massage);
		obs2.setMassage(massage);
		obs3.setMassage(massage);
		

		massage.setMassage("Buy bread");

	}

}
