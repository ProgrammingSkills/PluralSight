package printing;

//public class Printer<T extends ICartridge> implements IMachine {
public class Printer<T> implements IMachine {
	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	private T cartridge;
	private Machine machine;
	
	
	public Printer(boolean isOn, String modelNumber, T cartridge){
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
		this.cartridge = cartridge;
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
	
	public <U extends ICartridge> void printUsingCartridge(U cartridge, String message){
		System.out.println(cartridge.toString());
		System.out.println(message);
		System.out.println(cartridge.toString());
	}
	
	public void print(int copies){
		
		//System.out.println(cartridge.getFillPercentage());
		
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
