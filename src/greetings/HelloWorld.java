package greetings;

import printing.BWCartridge;
import printing.ICartridge;
import printing.IMachine;
import printing.Machine;
import printing.Printer;
import printing.ColorCartridge;
public class HelloWorld {

	public static void main (String[] args) {
		//Machine machine = new Machine(false);
		//IMachine machine = new Printer(true, "My machine");
		//machine.TurnOn();		
		//Printer<ColorCartridge> printer = new Printer<ColorCartridge> (true, "MY PRINTER", new ColorCartridge());
		//printer.printUsingCartridge( new ColorCartridge(), "Hi!");
		//printer.print(1);
		//myPrinter.loadPaper(3);
        //myPrinter.print(4);
		Printer<BWCartridge> printer = new Printer<BWCartridge> (true, "MY PRINTER", new BWCartridge());
		Printer<ColorCartridge> printer2 = new Printer<ColorCartridge> (true, "MY PRINTER", new ColorCartridge());
		Printer<ICartridge>
		
		printOne(printer2);
	}
	public static void printOne(Printer<? extends ICartridge> printer){
		String fillPercentage = printer.getCartridge().getFillPercentage();
		System.out.println(fillPercentage);
	}
}
