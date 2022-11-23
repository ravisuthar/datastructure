package designpattern.pattern.behavioral.chain.of.responsibility;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);

	void dispense(Currency cur);
}