/**
 * https://open.kattis.com/problems/plantingtrees
 */

import java.util.Arrays;

public class PlantingTrees {
    public static void main(String[] args) {
        PlantingTrees plantingTrees = new PlantingTrees();
        plantingTrees.run();
    }

    public static void reverse(int[] data) {
        int left = 0;
        int right = data.length - 1;

        while (left < right) {
            // swap the values at the left and right indices
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;

            // move the left and right index pointers in toward the center
            left++;
            right--;
        }
    }

    private void run() {
        Kattio io = new Kattio(System.in, System.out);

        while (io.hasMoreTokens()) {
            int[] trees = new int[io.getInt()];
            for (int i = 0; i < trees.length; i++) {
                trees[i] = io.getInt();
            }
            Arrays.sort(trees);
            reverse(trees);

            int max = 0;

            for (int i = 0; i < trees.length; i++) {
                int days = i + 1 + trees[i];
                if (days > max) {
                    max = days;
                }
            }
            System.out.println(max + 1);
        }
        io.close();
    }
}
