import main.java.CurrencyConverter;

public class CurrencyConverterTest {

    CurrencyConverter c = new CurrencyConverter();

    @Test
    public void testRupeeToDollar() {
        assertEquals(12.04,
                c.rupeeToDollar(1000),
                0.1);
    }

    private void assertEquals(double d, double rupeeToDollar, double e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testRupeeToEuro() {
        assertEquals(11.11,
                c.rupeeToEuro(1000),
                0.1);
    }

    @Test
    public void testDollarToRupee() {
        assertEquals(830,
                c.dollarToRupee(10),
                0.1);
    }

    @Test
    public void testEuroToRupee() {
        assertEquals(900,
                c.euroToRupee(10),
                0.1);
    }
}