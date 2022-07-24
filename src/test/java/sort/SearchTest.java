package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import searching.BinarySearch;
import searching.Search;

import java.util.stream.Stream;

class SearchTest {
    static Stream<Arguments> searchSources() {
        return Stream.of(
                Arguments.of(new BinarySearch())
        );
    }

    @ParameterizedTest
    @MethodSource("sort.SearchTest#searchSources")
    void search(Search search) {
        int[] arr = {-22, -15, 1, 7, 20, 35, 55};
        int k = -32;
        Assertions.assertEquals(-1, search.search(arr, k));
    }
}
