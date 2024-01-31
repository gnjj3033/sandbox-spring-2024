package unittests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        //SEAT
        int expected = 4;
        int actual = new Calculator().add(2, 2);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testAdd() {

        int expected = 6;
        int actual = new Calculator().add(2, 2,2);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        int expected = 2;
        int actual = new Calculator().subtract(4, 2);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        int expected = 2;
        int actual = new Calculator().multiply(2, 2);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void divideByZero() {
        assertThrows(ArithmeticException.class,() -> {
            new Calculator().divide(0, 0);
        });
    }
}