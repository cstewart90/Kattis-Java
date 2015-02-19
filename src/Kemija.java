import java.util.Scanner;

/**
 * https://open.kattis.com/problems/kemija08
 */

public class Kemija {
    public static void main(String[] args) {
        Kemija kemija = new Kemija();
        kemija.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String sentence = scanner.nextLine();

            sentence = sentence.replace("apa", "a");
            sentence = sentence.replace("epe", "e");
            sentence = sentence.replace("ipi", "i");
            sentence = sentence.replace("opo", "o");
            sentence = sentence.replace("upu", "u");

            System.out.println(sentence);
        }
        scanner.close();

    }
}
