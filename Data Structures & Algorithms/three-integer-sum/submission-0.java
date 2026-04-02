

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. Initialize the result list properly
        List<List<Integer>> result = new ArrayList<>();
        
        // 2. Sort the array (Crucial to handle duplicates easily later)
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // Skip duplicate values for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length; j++) {
                // Skip duplicate values for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                for (int k = j + 1; k < nums.length; k++) {
                    // Skip duplicate values for the third number
                    if (k > j + 1 && nums[k] == nums[k - 1]) continue;

                    // 3. Check the sum
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // Use Arrays.asList to create the inner list correctly
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        // 4. Return the actual result list, not null
        return result;
    }
}