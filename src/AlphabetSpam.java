/**
 * https://open.kattis.com/problems/alphabetspam
 */

public class AlphabetSpam {
    public static void main(String[] args) {
        AlphabetSpam alphabetSpam = new AlphabetSpam();
        alphabetSpam.run();
    }

    private void run() {
        Kattio io = new Kattio(System.in);

        while (io.hasMoreTokens()) {
            String line = io.getWord();

            int whiteSpace = 0;
            int lowerCase = 0;
            int upperCase = 0;
            int symbols = 0;

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '_') whiteSpace++;
                if (Character.isLowerCase(line.charAt(i))) lowerCase++;
                if (Character.isUpperCase(line.charAt(i))) upperCase++;
                if (!Character.isAlphabetic(line.charAt(i)) && line.charAt(i) != '_') symbols++;
            }

            System.out.println((double) whiteSpace / line.length());
            System.out.println((double) lowerCase / line.length());
            System.out.println((double) upperCase / line.length());
            System.out.println((double) symbols / line.length());
        }
    }
}

