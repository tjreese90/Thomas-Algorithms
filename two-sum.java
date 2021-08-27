import java.util.HashMap;
import java.util.Map;

//TODO: Add Comments on how hashMap works

class twoSum {
    // Reversing an Integer Value passed in.
    public static void main(String[] args) {

        // Edit Number to reverse to test different cases
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;

        // Slow approach
        System.out.println(twoSumSlow(numbers, target));
        System.out.println(twoSumFast(numbers, target));
    }

    // Method that reverse an int passed into it slower approach.
    // This would be O(n)^2 we want linear
    public static int[] twoSumSlow(int[] nums, int target) {

        // can not use repeat of numbers.
        //Creating two for loops to compare values within nums array.
        for (int i = 0; i < nums.length; i++) {
            // i + 1 puts j at 1 but automatically stops because i for loops should stop first.
            for (int j = i + 1; j < nums.length; j++) {

                int complement = target - nums[i];

                if (nums[j] == complement) {

                    return new int[] { i, j };
                }

            }
        }

        throw new IllegalArgumentException("no match found");

    }

    // Linear Approach using HashMap since they have "Constant Time look up"
    public static int[] twoSumFast(int[] nums, int target) {
        // Declaring Hash Map with Key and Values as <Integer, Integer> as a
        // newHashMap<>();
        Map<Integer, Integer> numberMap = new HashMap<>();
        // creating for loop to put values into HashMap and search for second value
        // needed to find the target.
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];
            // if HashMap contains the key needed for target then return the complement
            // index and i value.
            if (numberMap.containsKey(complement)) {
                return new int[] { numberMap.get(complement), i };
            }
            // else add the value at [i] to the value of i in the hashmap
            numberMap.put(nums[i], i);
        }
        // This is used so we don't have to use a return statement for the public static
        // int[] twoSumFast.
        throw new IllegalArgumentException("no match found!");
        // If nothing is returned before this throw then no match was found in the list.
    }

}
