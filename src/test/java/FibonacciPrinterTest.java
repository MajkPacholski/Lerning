import com.fibo.FibonacciPrinter;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciPrinterTest {

   public void fibonacciPrinterTest () {
       FibonacciPrinter fibonacciPrinter = new FibonacciPrinter(11, 59);
       assertEquals(4, fibonacciPrinter.getFibonacciNumbersByConstraint());assertEquals(13, fibonacciPrinter.getFibonacciNumbersByConstraint().
               get(0));
       List<Integer> fibonacciNumbersByConstraint = fibonacciPrinter.getFibonacciNumbersByConstraint();
       assertEquals(55, fibonacciNumbersByConstraint.get(fibonacciNumbersByConstraint.size() - 1));
   }

}