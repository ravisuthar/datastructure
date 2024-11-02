package morgonstanely;

public class SequenceNumberGeneratorTest {

    private static final int TOTAL_NUMBER_IN_SEQUENCE = 20;

    public static void main(String[] args) {

        OddAndEvenNumberGenerator oddAndEvenNumberGenerator = new OddAndEvenNumberGenerator(TOTAL_NUMBER_IN_SEQUENCE);

        Thread t1 = new Thread(new OddNumberPrinter(oddAndEvenNumberGenerator), "Thread-1");
        Thread t2 = new Thread(new EvenNumberPrinter(oddAndEvenNumberGenerator), "Thread-2");

        t1.start();
        t2.start();

    }
}
