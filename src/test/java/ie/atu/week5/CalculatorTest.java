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
    void testAdd(){assertEquals(3, myResult.add(1,2));
    }

}
