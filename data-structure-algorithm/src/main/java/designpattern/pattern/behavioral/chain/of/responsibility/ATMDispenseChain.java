package designpattern.pattern.behavioral.chain.of.responsibility;

import java.util.Scanner;

public class ATMDispenseChain {
	private DispenseChain c100;

	public ATMDispenseChain() {
		// initialize the chain
		this.c100 = new Dollar100Dispenser();
		
		DispenseChain c50 = new Dollar50Dispenser();
		DispenseChain c20 = new Dollar20Dispenser();
		DispenseChain c10 = new Dollar10Dispenser();
		
		// set the chain of responsibility
		c100.setNextChain(c50);
		c50.setNextChain(c20);
		c20.setNextChain(c10);
	}

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atmDispenser.c100.dispense(new Currency(amount));
		}
	}
}
