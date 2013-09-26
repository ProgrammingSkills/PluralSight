package printing;

public class Machine implements IMachine{

	protected boolean isOn;
	
	public Machine(boolean isOn){
		this.isOn = isOn;
	}

	public void TurnOn(){
		isOn = true;
		System.out.println("Machine is on!");
	}

	@Override
	public void TurnOff() {
		isOn = false;
		
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return false;
	}
}
