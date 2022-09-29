import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Assignment {
    @Test
    public void TestcheckForPrime() {
        PrimeNumberProgram primeNumberProgram = new PrimeNumberProgram();
        boolean results = primeNumberProgram.checkForPrime(7);
        assertEquals(true, results);
    }

    @Test
    public void TestcheckLeapYear() {
        LeapYear leapYear = new LeapYear();
        boolean rslt = leapYear.checkLeapYear(2001);
        assertEquals(false, rslt);
    }

    @Test
    public void Testcalculatesum() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(4.00, 12.00);
        assertEquals(2.40, rslts, 2);
    }

}
