package quadratic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the Quadratic Function Class.
 * Still under construction. Tests for the remaining functions
 * will be updated soon!
 * @author Abdilahi MJ
 */
public class TheQuadraticFunctionTest {
    /**
     * Object to be tested.
     */
    private final TheQuadraticFunction quadratic = new TheQuadraticFunction(4.5,42,7.2);


    // Tests the evaluate function.
    @Test
    void evalTester() {
        assertEquals(109.2, quadratic.eval(2));
    }

    // Tests the extreme point function.
    @Test
    void extremePointTester(){
        assertEquals(-14.0/3.0,quadratic.extremePoint());
    }
}
