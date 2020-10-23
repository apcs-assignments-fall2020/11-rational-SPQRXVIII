public class RationalClient {
    
    public static void main(String[] args) {
        Rational r = new Rational(1, 2);
        System.out.println(r);

        // We can use dot notation to access the integer values
        // of the numerator and denominator directly
        System.out.println(r.numerator);
        System.out.println(r.denominator);}

}
