import junit.framework.TestCase;

/**
 * Example JUnit test from Appendix A.
 */
public class SeriesTest extends TestCase {

    public void testFibonacci() {
        assertEquals(1, Series2.fibonacci(1));
        assertEquals(1, Series2.fibonacci(2));
        assertEquals(2, Series2.fibonacci(3));
    }

}
