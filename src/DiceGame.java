/**
 * https://open.kattis.com/problems/dicegame
 */

public class DiceGame {
    public static void main(String[] args) {
        DiceGame diceGame = new DiceGame();
        diceGame.run();
    }

    private void run() {
        Kattio io = new Kattio(System.in, System.out);

        while (io.hasMoreTokens()) {
            double a1 = io.getInt();
            double b1 = io.getInt();
            double a2 = io.getInt();
            double b2 = io.getInt();
            double a3 = io.getInt();
            double b3 = io.getInt();
            double a4 = io.getInt();
            double b4 = io.getInt();

            double Gunnar = average(a1, b1) + average(a2, b2);
            double Emma = average(a3, b3) + average(a4, b4);

            if (Gunnar > Emma) {
                System.out.println("Gunnar");
            } else if (Emma > Gunnar) {
                System.out.println("Emma");
            } else {
                System.out.println("Tie");
            }
        }
        io.close();
    }

    private double average(double a, double b) {
        return (a + b) / 2;
    }
}
