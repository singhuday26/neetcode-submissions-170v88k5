
public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        // 1. Remove duplicates and allow O(1) lookup
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxStreak = 0;

        // 2. Iterate through the set
        for (int num : set) {
            // 3. Only start a streak if 'num' is the START of a sequence
            // (i.e., num-1 does not exist)
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // 4. Count how long this sequence goes
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // 5. Update the global maximum
                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }

        return maxStreak;
    }
}