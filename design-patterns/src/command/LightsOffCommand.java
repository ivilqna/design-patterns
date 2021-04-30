package command;

public class LightsOffCommand implements Command {
	
	private Lights lights;
	

	public LightsOffCommand(Lights lights) {
		this.lights=lights;	}

	public void execute() {
		this.lights.switchOff();
	}
}
