package algorithm;

public class Driver {
    public static void main(String[] args) {

        FibonacciNumbers fn = new FibonacciNumbers();

        for(int x = 0; x <= 55; x ++) {
            System.out.println("fib(" + x + ") = " + fn.fib(x));
        }

    }

}
