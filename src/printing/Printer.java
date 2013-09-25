package printing;

public class Printer {

	private boolean isOn;
	private String modelNumber;
	
	public Printer(boolean isOn, String modelNumber){
		this.isOn = isOn;
		this.modelNumber = modelNumber;
	}
	
	public void print(int copies){
		String onStatus = "";
		if(isOn)
			onStatus = "Is On";
		else
			onStatus = "is Off";
		
		String texttoPrint = modelNumber + onStatus;
		
		while (copies>0){
			System.out.println(texttoPrint);
			copies--;
		}		
	}
	public void printColors(){
		String[] colors = new String[]{"RED","BLUE","GREEN","YELLOW"};
		
		for(String currentColor : colors){
			if("Green".equals(currentColor))
				continue;
		}
	}
	
}
