package sorting;

/**
 * Divide and conquer algorithm
 * Recursive algorithm
 * In-place algorithm
 * O(nlogn) time complexity
 * Unstable algorithm
 */
public class QuickSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length);
        return arr;
    }

    private void quickSort(int[] arr, int start, int end) {
        if (end - start < 2) return;
        int pivot = partition(arr, start, end);
        quickSort(arr, 0, pivot);
        quickSort(arr, pivot + 1, end);
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start, j = end;

        while (i < j) {
            while (i < j && arr[--j] >= pivot) {
                // Note: empty loop body
            }
            if (i < j) {
                arr[i] = arr[j];
            }
            while (i < j && arr[++i] <= pivot) {
                // Note: empty loop body
            }
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }
}
