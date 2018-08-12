package gitflow;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        // write your code here
        showText("TEST");

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = sumArray(numbers);
        showText(String.valueOf(sum));
        showText(Integer.toString(sum));
    }

    public static void showText(String text) {
        System.out.println("Tekst: " + text);
    }

    public static int sumArray(int[] tablica) {
        int sum = 0;
        for (int number : tablica) {
            sum += number;
        }
        return sum;
    }
}
