package sorting;

public class RadixSort {
    public int[] sort(int[] arr, int radix, int width) {
        for (int i = 0; i < width; i++) stableCountingSort(arr, i, radix);
        return arr;
    }

    public String[] sort(String[] arr, int radix, int width) {
        for (int i = 0; i < width; i++) stableCountingSort(arr, i, radix);
        return arr;
    }

    private void stableCountingSort(int[] arr, int position, int radix) {
        int[] countArr = new int[radix];
        for (int value : arr) countArr[getDigit(position, value, radix)]++;
        // Adjust the count array
        for (int i = 1; i < radix; i++) countArr[i] += countArr[i - 1];

        int[] temp = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) temp[--countArr[getDigit(position, arr[i], radix)]] = arr[i];
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    private void stableCountingSort(String[] arr, int position, int radix) {
        int[] countArr = new int[radix];
        for (String s : arr) countArr[getChar(s, position)]++;

        // Adjust
        for (int i = 1; i < radix; i++) countArr[i] += countArr[i - 1];

        String[] temp = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) temp[--countArr[getChar(arr[i], position)]] = arr[i];
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    private int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }

    private char getChar(String s, int position) {
        return s.charAt(s.length() - position - 1);
    }
}
