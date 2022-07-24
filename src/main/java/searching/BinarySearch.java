package searching;

import java.util.Arrays;

/**
 * O(logn) time complexity
 */
public class BinarySearch implements Search {
    @Override
    public int search(int[] arr, int k) {
        Arrays.sort(arr);
        return binarySearch(arr, 0, arr.length, k);
    }

    private int binarySearch(int[] arr, int start, int end, int k) {
        if (start >= end) return -1;
        int mid = start + (end - start) / 2;
        if (k < arr[mid]) {
            return binarySearch(arr, start, mid, k);
        } else if (k > arr[mid]) {
            return binarySearch(arr, mid + 1, end, k);
        }
        return mid;
    }
}
