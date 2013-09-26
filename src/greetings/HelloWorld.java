package greetings;

import printing.Machine;
import printing.Printer;

public class HelloWorld {

	public static void main (String[] args) {
		// TODO Auto-generated constructor stub
		Machine machine = new Printer(true, "MY Printer");
		
		//Machine machine = new Machine(false);
		
		machine.TurnOn();
		//myPrinter.loadPaper(3);
        //myPrinter.print(4);

	}
}
