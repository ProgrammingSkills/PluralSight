package printing;

public class Machine {

	protected boolean isOn;
	
	public Machine(boolean isOn){
		this.isOn = isOn;
	}

	public void TurnOn(){
		isOn = true;
	}
	
	public void TunrOff(){
		isOn = false;
	}
}
