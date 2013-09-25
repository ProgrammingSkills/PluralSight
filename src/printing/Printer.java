package printing;

public class Printer extends Machine {
	
	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	
	public Printer(boolean isOn, String modelNumber){
		super(isOn);
		this.modelNumber = modelNumber;
	}
	
	public void print(int copies){
		String onStatus = "";
		if(isOn)
			onStatus = "Is On";
		else
			onStatus = "is Off";
		
		String texttoPrint = modelNumber + onStatus;
		
		while (copies>0 && !paperTray.isEmpty()){
			System.out.println(texttoPrint);
			copies--;
			paperTray.usePage();
		}
		
		if(paperTray.isEmpty())
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
	}
	
}
