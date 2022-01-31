package main.sort;

public class RadixSortV2Alphabet {
    public static void main(String[] args) {
        String[] stringsArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(stringsArray, 26, 5);

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    public static void radixSort(String[] input, int radix, int width) {
        // will sort from least significant digit to the most significant digit from right to left to ensure
        // stability of algorithm
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value: input) {
            // increments countArray with specific index obtained from digit of value from input
            countArray[getIndex(position, value)]++;
        }

        // this will update countArray to track numbers with lesser or equal to specific digit of interest with index
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            // this will append values from smallest to largest which is dictated by position (which is also the digit
            // value weight which can be 1, 10, 100 or 1000)
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }
}
