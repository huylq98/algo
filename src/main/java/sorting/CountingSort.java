package sorting;

/**
 * Make assumptions about the data
 * DOESN'T use comparisons
 * Counts the number of occurrences of each value
 * Only works with non-negative discrete values (can't work with floats, strings)
 * Values must be within a specific range (range can't be huge)
 * Not an in-place algorithm
 * O(n) time complexity
 */
public class CountingSort {
    public int[] sort(int[] arr, int min, int max) {
        int[] countArr = new int[(max - min) + 1];
        for (int element : arr) countArr[element - min]++;
        int index = 0;
        for (int i = min; i <= max; i++) {
            while (countArr[i - min] > 0) {
                arr[index++] = i;
                countArr[i - min]--;
            }
        }
        return arr;
    }
}
