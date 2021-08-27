import java.util.HashMap;
import java.util.Map;

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

        for (int i = 0; i < nums.length; i++) {
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

        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (numberMap.containsKey(complement)) {
                return new int[] { numberMap.get(complement), i };
            }
            numberMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found!");
    }

}
