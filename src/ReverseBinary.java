public class ReverseBinary {
    public static void main(String[] args) {
        ReverseBinary reverseBinary = new ReverseBinary();
        reverseBinary.run();
    }

    private void run() {
        Kattio io = new Kattio(System.in, System.out);

        while (io.hasMoreTokens()) {
            int decimal = io.getInt();
            String binary = Integer.toBinaryString(decimal);
            String reversedBinary = new StringBuilder(binary).reverse().toString();
            io.println(Integer.parseInt(reversedBinary, 2));
        }
        io.close();
    }
}
