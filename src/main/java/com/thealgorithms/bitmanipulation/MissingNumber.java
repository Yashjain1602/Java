package com.thealgorithms.bitmanipulation;

/**
 * To Find the Missing Number In An Array Using Bit Manipulation
 * @author Yash Jain (https://github.com/Yashjain1602)
 */

public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        // For xor of all the elements in array
        int temp1 = nums[0];
        // For xor of all the elements from 1 to n+1
        int temp2 = 1;
        // For xor of all the elements in array
        for (int i = 1; i < n; i++) {
            temp1 ^= nums[i];
        }
        // For xor of all the elements from 2 to n+1
        for (int i = 2; i <= n + 1; i++) {
            temp2 ^= i;
        }
        return (temp1 ^ temp2);
    }
}
