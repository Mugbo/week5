package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator myResult;

    @BeforeEach
    void setUp() {
        myResult = new Calculator();
    }

    @Test
    void testAdd(){assertEquals(3, myResult.add(1,2));}

    @Test
    void testMultiply(){assertEquals(25, myResult.multiply(5,5));}

    @Test
    void testDivide(){assertEquals(9,myResult.divide(81,9));}

    @Test
    void testSubtract(){assertEquals(7,myResult.subtract(10,3));}


}
