/**
 * https://open.kattis.com/problems/reversebinary
 */

public class ReverseBinary {
    public static void main(String[] args) {
        ReverseBinary reverseBinary = new ReverseBinary();
        reverseBinary.run();
    }

    private void run() {
        Kattio io = new Kattio(System.in);

        while (io.hasMoreTokens()) {
            int decimal = io.getInt();
            String binary = Integer.toBinaryString(decimal);
            String reversedBinary = new StringBuilder(binary).reverse().toString();
            System.out.println(Integer.parseInt(reversedBinary, 2));
        }
        io.close();
    }
}
