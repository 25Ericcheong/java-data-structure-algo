package main.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = 7;
        intArray[3] = -22;

        // what if we do not know index. Worst case for this would be the
        // last position of array. Meaning, need to search through whole
        // array, and there are 4 elements and this would influence numebr of
        // steps. More elements - more steps (to loop array). Making it a
        // linear complexity. So, if we do not know index, the time
        // complexity would be O(n). When we know index, it would be O(1).
        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);

    }
}
