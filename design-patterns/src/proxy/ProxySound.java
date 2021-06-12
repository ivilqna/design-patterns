package proxy;

public class ProxySound implements Sound {

	private RealSound realSound;
	private String fileName;
	
	public ProxySound(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void play() {
		
		//Place where we can deny access to realSound
		//e.g. If user not authorized return;
		
		if(this.realSound == null) {
		this.realSound = new RealSound(this.fileName);
			
		}
		
		this.realSound.play();

	}

}
