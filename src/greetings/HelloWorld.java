package greetings;

import printing.Printer;

public class HelloWorld {

	public static void main (String[] args) {
		// TODO Auto-generated constructor stub
		Printer myPrinter = new Printer(true, "MY Printer");
		
		myPrinter.loadPaper(3);
        myPrinter.print(4);

	}
}
