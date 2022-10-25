package morgonstanely;

public class TryFinally {

    public void divide(int a, int b) {
        try {
            int c = a / b;
        } finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) {
        TryFinally t = new TryFinally();
        try {
            t.divide(3, 0);
        } catch (RuntimeException e) {
            System.out.println("Runtime");

        } catch (Exception e) {
            System.out.println("Exception");

        } finally {
            System.out.println("Finally Catch");
        }
    }
}
