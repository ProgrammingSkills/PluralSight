package printing;

public class Printer implements IMachine {
	
	private String modelNumber;
	private PaperTray paperTray = new PaperTray();

	private Machine machine;
	
	
	public Printer(boolean isOn, String modelNumber){
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
	}
	
	@Override
	public void TurnOn(){
		System.out.println("System test");
		machine.TurnOn();
	}
	
	@Override
	public void TurnOff() {
		machine.TurnOff();
	}
	
	@Override
	public boolean isOn(){
		return machine.isOn();
	}
	
	public void print(int copies){
		String onStatus = "";
		if(machine.isOn())
			onStatus = "Is On";
		else
			onStatus = "is Off";
		
		String texttoPrint = modelNumber + onStatus;
		
		while (copies>0 && paperTray.isEmpty()){
			System.out.println(texttoPrint);
			copies--;
			paperTray.usePage();
		}
		
		if(paperTray.isEmpty()!=true)
			System.out.println("Load more paper");
	}
	public void printColors(){
		String[] colors = new String[]{"RED","BLUE","GREEN","YELLOW"};
		
		for(String currentColor : colors){
			if("Green".equals(currentColor))
				continue;
		}
	}

	public void loadPaper(int i) {
		paperTray.addPaper(i);
		System.out.println(paperTray.pages);
	}	
}
