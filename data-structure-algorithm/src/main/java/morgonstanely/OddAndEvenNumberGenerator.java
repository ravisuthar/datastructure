package morgonstanely;

public class OddAndEvenNumberGenerator {
    private int totalNumberInSequence;
    private int counter=1;
    private boolean isEven=false;

    public OddAndEvenNumberGenerator(int totalNumberInSequence) {
        this.totalNumberInSequence = totalNumberInSequence;
    }

    public void printOddNumber(){

        synchronized (this){

            while(counter <= totalNumberInSequence){

                while(isEven){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName()+" :"+counter);
                counter++;
                isEven=true;
                notify();
            }
        }
    }

    public void printEvenNumber(){

        synchronized (this){

            while(counter <= totalNumberInSequence){

                while(!isEven){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName()+" :"+counter);
                counter++;
                isEven=false;
                notify();
            }
        }
    }
}
