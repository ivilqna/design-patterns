package adapter;

public class FormatAdapter implements MediaPlayer {

	private MediaPackage mediaPackage;
	
	public FormatAdapter(MediaPackage mediaPackage) {
	this.mediaPackage = mediaPackage;
	}
	
	public void play(String fileName) {
		System.out.println("Opening file with an adapter");
		this.mediaPackage.playFile(fileName);
	}

}
