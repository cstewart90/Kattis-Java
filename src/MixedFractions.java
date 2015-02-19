/**
 * https://open.kattis.com/problems/mixedfractions
 */

public class MixedFractions {
    public static void main(String[] args) {
        MixedFractions mixedFractions = new MixedFractions();
        mixedFractions.run();
    }

    private void run() {
        Kattio io = new Kattio(System.in);

        while (io.hasMoreTokens()) {
            int numerator = io.getInt();
            int denominator = io.getInt();

            if (numerator == 0 && denominator == 0) {
                break;
            }

            int whole = numerator / denominator;
            numerator = numerator % denominator;

            System.out.println(String.format("%d %d / %d", whole, numerator, denominator));
        }
        io.close();

    }
}
