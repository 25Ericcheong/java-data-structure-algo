package main.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        // for left partition, first 3
        mergeSort(input, start, mid);

        // for right partition, the rest of array
        mergeSort(input, mid, end);

        // to merge both sorted partitions
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {

        // means that last element of left partition is smaller than first element of right partition, meaning -
        // array is fully sorted already. Do merging required - optimized code
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        // merging required
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            // <= preserves relative order of duplicate numbers - making algorithm stable
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // handle remain elements for array that we have not traverse - however, for optimization purposes, if there
        // are elements left in right partition - there is no need to do anything because it is the largest value and
        // it is already positioned on the last index of original array and temporary array will only be inserted to
        // original array anyway. But if there are elements in the left partition, something needs to be done because
        // it needs to be repositioned

        // copy whatever element that we were not able to handle in the left partition into the original/input array
        // since these weren't traversed, they are the largest elements - meaning these elements will need to be
        // repositioned to the right most of the original arrays which is correct as they are the largest
        // if left array/partition is completely traversed, then mid - i will be 0 and nothing will happen in this
        // line of code
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        // we then copy the whole temp array into the original/input array and tempIndex would mean that we copy all
        // the element that we have managed to sort so far from both partitions
        // reminder - if there are elements left over in the right partitions - there is nothing that needs to be
        // done as these numbers are already in the correct position in the original/input array
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
