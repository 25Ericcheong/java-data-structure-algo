package main.sort;

public class BubbleSort {
    public static void main(String[] args) {
        // one of the many algorithm implementation

        // implementation sorts array from right to left - in ascending order and there are other implementations for
        // descending, sorting from left to right and etc.
        int [] intArray = {20, 35, -15, 7, 55, 1, -22};

        // sorts from right to left for each iteration of outer loop - want to traverse and bubble largest element to
        // the right and sort it

        // looking at code, can see that it is lesser than O(n^2), inner loop doesn't cross into sorted partition.
        // However, when it comes to determining time complexity - we want a general idea of how the steps grow when
        // the number of element grows.

        // this code is optimized. Bubble sort would cross over into sorted parts of the array but for this code, it
        // doesn't.
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // i does not need to be larger than lastUnsortedIndex since that
            // partitioned part is already sorted
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        // print sorted array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    /**
     * Swaps elements when it meets requirements
     *
     * @param array that will be passed to swap elements in it
     * @param i index (initial) element that will be compared to the next
     *          element
     * @param j index (next) element that will be compared to the
     *          initial element
     */
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


