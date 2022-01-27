package main.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    // end index is always 1 greater than index we iterested in
    public static void quickSort(int[] input, int start, int end) {
        // meaning this is a 1 element array
        if (end - start < 2) {
            return;
        }

        // since it is more than 1 element, need to find pivot
        // will return position of the pivot and at that position - everything to the left is smaller and to the
        // right is larger
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // this uses first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // empty loop body - looking for value smaller than pivot
            // if it is, need to move it to the left of pivot
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // empty loop - looking for value greater than pivot
            // if it is, need to move it to the right of pivot
            while (i < j && input[++i] <= pivot);
            input[j] = input[i];
        }

        input[j] = pivot;
        return j;
    }
}
