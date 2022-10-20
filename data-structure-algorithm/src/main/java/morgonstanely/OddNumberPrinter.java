package morgonstanely;

public class OddNumberPrinter implements Runnable {

    private OddAndEvenNumberGenerator oddAndEvenBumberGenerator;


    public OddNumberPrinter(OddAndEvenNumberGenerator oddAndEvenBumberGenerator) {
        super();
        this.oddAndEvenBumberGenerator = oddAndEvenBumberGenerator;
    }

    @Override
    public void run() {
        oddAndEvenBumberGenerator.printOddNumber();
    }

}