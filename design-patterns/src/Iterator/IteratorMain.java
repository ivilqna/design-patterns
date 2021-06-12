package Iterator;

public class IteratorMain {

	public static void main(String[] args) {

		NameRepository nameRepo = new NameRepository();
		
		for(Iterator iterator = nameRepo.getIterator(); iterator.hasNext();) {
			
			String name = (String) iterator.next();
			System.out.println(name);
		}
		
	}

}
