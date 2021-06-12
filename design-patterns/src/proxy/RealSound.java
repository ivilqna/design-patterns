package proxy;

public class RealSound implements Sound {
	
	private String fileName;

	public RealSound(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void play() {
		System.out.println("Playing sound: " +  this.fileName);

	}

}
