package math;

import java.util.Arrays;

/**
 * LeetCode problem #1920: <a href="https://leetcode.com/problems/build-array-from-permutation/">Build Array From Permutation</a>
 * O(n) time complexity
 * O(1) space complexity
 */
public class EuclidDivisionAlgorithm {

    // Euclid's Division Lemma: a = qb + r (r < q)
    // ==>   a / q = b
    //      a % q = r
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = n * (nums[nums[i]] % n) + nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }

        // Expect: [0,1,2,4,5,3]
        System.out.println(Arrays.toString(nums));
    }
}
