/**
 * https://open.kattis.com/problems/aaah
 */

public class Aaah {
    public static void main(String[] args) {
        Aaah aah = new Aaah();
        aah.run();
    }

    private void run() {
        Kattio io = new Kattio(System.in);

        while (io.hasMoreTokens()) {
            String a = io.getWord();
            String b = io.getWord();

            System.out.println(b.length() > a.length() ? "no" : "go");
        }
        io.close();
    }
}
