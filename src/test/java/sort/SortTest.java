package sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import sorting.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortTest {
    static Stream<Arguments> sourceArrays() {
        return Stream.of(
                Arguments.of(new BubbleSort()),
                Arguments.of(new SelectionSort()),
                Arguments.of(new InsertionSort()),
                Arguments.of(new ShellSort()),
                Arguments.of(new MergeSort()),
                Arguments.of(new QuickSort())
        );
    }

    @ParameterizedTest
    @MethodSource("sort.SortTest#sourceArrays")
    void sort(Sort sort) {
        int[] sorted = {-22, -15, 1, 7, 20, 35, 55};
        int[] unsorted = {20, 35, -15, 7, 55, 1, -22};
        assertArrayEquals(sorted, sort.sort(unsorted));
    }

    @Test
    void countingSort() {
        int[] sorted = {2, 2, 3, 4, 5, 7, 8, 8, 9, 10};
        int[] unsorted = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        assertArrayEquals(sorted, new CountingSort().sort(unsorted, 1, 10));
    }
}
