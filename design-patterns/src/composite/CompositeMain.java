package composite;

public class CompositeMain {

	public static void main(String[] args) {


		Manager manager1 = new Manager("Georgi", 5000);
		
		Developer dev1 = new Developer("Stoyan",4000);
		Developer dev2 = new Developer("Ivan",3500);
		
		manager1.add(dev1);
		manager1.add(dev2);
		
		
		Manager manager2 = new Manager("Stamat", 6000);
		Developer dev3 = new Developer("Peter",5000);
		
		manager2.add(dev3);
		
		Manager manager3=new Manager("Root Manager",8000);
		Developer dev4 = new Developer("Stavri",7000);
		
		manager3.add(manager1);
		manager3.add(manager2);
		manager3.add(dev4);
		
		manager3.printData();
	}

}
