/**
 * https://open.kattis.com/problems/doorman
 */

public class Doorman {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        doorman.run();
    }

    private void run() {
        Kattio io = new Kattio(System.in);

        while (io.hasMoreTokens()) {
            int maxDifference = io.getInt();
            String queue = io.getWord();

            System.out.println(maxPeople(maxDifference, queue.toCharArray()));
        }
        io.close();
    }

    private int maxPeople(int maxDifference, char[] queue) {
        int men = 0;
        int women = 0;
        int difference;

        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == 'M') {
                men++;
            } else {
                women++;
            }

            difference = Math.abs(men - women);
            if (difference > maxDifference) {
                if (queue[i] == queue[i + 1]) {
                    return i;
                }
            }

        }

        return queue.length;
    }


}
