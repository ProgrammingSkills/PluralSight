package greetings;

import printing.IMachine;
import printing.Machine;
import printing.Printer;

public class HelloWorld {

	public static void main (String[] args) {
		// TODO Auto-generated constructor stub
		//Machine machine = new Printer(true, "MY Printer");
		
		//Machine machine = new Machine(false);
		IMachine machine = new Printer(true, "My machine");
		machine.TurnOn();
		
		//myPrinter.loadPaper(3);
        //myPrinter.print(4);

	}
}
