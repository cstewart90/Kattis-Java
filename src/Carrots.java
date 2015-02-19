/**
 * https://open.kattis.com/problems/carrots
 */

import java.io.IOException;

public class Carrots {
    public static void main(String[] args) throws IOException {
        Carrots carrots = new Carrots();
        carrots.run();
    }

    private void run() throws IOException {
        Kattio io = new Kattio(System.in);

        while (io.hasMoreTokens()) {
            int contestants = io.getInt();
            System.out.println(io.getInt());

            for (int i = 0; i < contestants; i++) {
                io.getLine();
            }
        }
    }
}
