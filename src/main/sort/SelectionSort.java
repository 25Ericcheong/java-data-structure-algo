package main.sort;

public class SelectionSort {

    int [] intArray = {20, 35, -15, 7, 55, 1, -22};

    
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
