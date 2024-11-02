package morgonstanely;

public class EvenNumberPrinter implements Runnable {

    private OddAndEvenNumberGenerator oddAndEvenBumberGenerator;


    public EvenNumberPrinter(OddAndEvenNumberGenerator oddAndEvenBumberGenerator) {
        super();
        this.oddAndEvenBumberGenerator = oddAndEvenBumberGenerator;
    }

    @Override
    public void run() {
        oddAndEvenBumberGenerator.printEvenNumber();
    }

}