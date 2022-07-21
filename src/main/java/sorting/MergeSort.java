package sorting;

/**
 * Divide and conquer algorithm
 * Recursive algorithm
 * Not in-place algorithm
 * O(nlogn) time complexity
 */
public class MergeSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        split(arr, 0, arr.length);
        return arr;
    }

    private void split(int[] arr, int start, int end) {
        if (end - start < 2) return;
        int mid = start + (end - start) / 2;
        split(arr, start, mid);
        split(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
        // All left elements are less than or equal to all right elements
        if (arr[mid - 1] <= arr[mid]) return;

        int[] temp = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        // Leftover right elements is already in sorted position
        System.arraycopy(arr, i, arr, start + k, mid - i);
        System.arraycopy(temp, 0, arr, start, k);
    }
}
