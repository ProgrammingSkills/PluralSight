package printing;

public class Machine {

	protected boolean isOn;
	
	public Machine(boolean isOn){
		this.isOn = isOn;
	}

	public void TurnOn(){
		isOn = true;
		System.out.println("Machine is on!");
	}
	
	public void TunrOff(){
		isOn = false;
	}
}
