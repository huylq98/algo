package sorting;

/**
 * In-place algorithm
 * O(n^2) time complexity
 * Stable sort algorithm
 */
public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
        return arr;
    }
}
