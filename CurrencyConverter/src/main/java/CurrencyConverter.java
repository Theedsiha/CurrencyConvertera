public class CurrencyConverter {

    // Conversion rates
    static double dollarRate = 83.0;
    static double euroRate = 90.0;

    // Rupee to Dollar
    public double rupeeToDollar(double rupee) {
        return rupee / dollarRate;
    }

    // Rupee to Euro
    public double rupeeToEuro(double rupee) {
        return rupee / euroRate;
    }

    // Dollar to Rupee
    public double dollarToRupee(double dollar) {
        return dollar * dollarRate;
    }

    // Euro to Rupee
    public double euroToRupee(double euro) {
        return euro * euroRate;
    }

    public static void main(String[] args) {

        CurrencyConverter c = new CurrencyConverter();

        System.out.println("1000 Rupees to Dollar = "
                + c.rupeeToDollar(1000));

        System.out.println("1000 Rupees to Euro = "
                + c.rupeeToEuro(1000));

        System.out.println("10 Dollar to Rupee = "
                + c.dollarToRupee(10));

        System.out.println("10 Euro to Rupee = "
                + c.euroToRupee(10));
    }
}