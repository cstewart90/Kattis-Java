/**
 * https://open.kattis.com/problems/phonelist
 */

import java.util.Arrays;

public class PhoneList {
    public static void main(String[] args) {
        PhoneList phoneList = new PhoneList();
        phoneList.run();
    }

    private void run() {
        Kattio io = new Kattio(System.in);

        int testCases = io.getInt();

        for (int i = 0; i < testCases; i++) {
            String[] phoneNumbers = new String[io.getInt()];

            for (int j = 0; j < phoneNumbers.length; j++) {
                phoneNumbers[j] = io.getWord();
            }

            Arrays.sort(phoneNumbers);
            System.out.println(isConsistent(phoneNumbers) ? "YES" : "NO");
        }

        io.close();
    }

    private boolean isConsistent(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1].length() >= array[i].length()) {
                if (array[i + 1].startsWith(array[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}


