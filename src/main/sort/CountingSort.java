package main.sort;

public class CountingSort {
    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(intArray, 1, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            // this  is so that countingSort can sort elements in arrays with min value that is not equal to 0
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                // inserts element in the right index/position
                input[j++] = i;

                // updates countArray element as value was already added in the previous line of code
                countArray[i - min]--;
            }
        }

    }
}
