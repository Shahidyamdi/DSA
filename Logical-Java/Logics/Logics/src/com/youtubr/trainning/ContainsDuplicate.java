package com.youtubr.trainning;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique values
        Set<Integer> uniqueSet = new HashSet<>();
        
        // Iterate through the array
        for (int num : nums) {
            // If the current number is already in the HashSet, return true (duplicate found)
            if (uniqueSet.contains(num)) {
                return true;
            }
            // Otherwise, add the number to the HashSet
            uniqueSet.add(num);
        }
        
        // If the loop completes without finding duplicates, return false
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        boolean result = containsDuplicate(nums);
        System.out.println(result); // This will print true since there are duplicates in the array
    }
}