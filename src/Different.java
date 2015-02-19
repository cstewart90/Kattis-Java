/**
 * https://open.kattis.com/problems/different
 */
public class Different {
    public static void main(String[] args) {
        Different different = new Different();
        different.run();
    }

    private void run() {
        Kattio io = new Kattio(System.in);

        while (io.hasMoreTokens()) {
            long n1 = io.getLong();
            long n2 = io.getLong();

            System.out.println(Math.abs(n1 - n2));
        }
        io.close();
    }

}
