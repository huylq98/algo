package sorting;

/**
 * Variation of Insertion Sort which reduces the amount of shifting required
 * In-place algorithm
 * O(n^2) time complexity but better performance than Insertion Sort
 * Unstable algorithm
 */
public class ShellSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        for (int gap = arr.length / 2; gap >= 1; gap /= 2) {
            for (int firstUnsortedIndex = gap; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
                int newElement = arr[firstUnsortedIndex];
                int i = firstUnsortedIndex;
                while (i >= gap && arr[i - gap] > newElement) {
                    arr[i] = arr[i - gap];
                    i -= gap;
                }
                arr[i] = newElement;
            }
        }
        return arr;
    }
}
