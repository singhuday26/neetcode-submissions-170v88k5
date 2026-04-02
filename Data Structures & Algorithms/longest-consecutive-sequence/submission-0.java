

class Solution {
    public int longestConsecutive(int[] nums) {
        // 1. Edge case: if the array is empty, the longest sequence is 0
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 2. Remove duplicates using a Set
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        // 3. Convert Set to a new array (arrN)
        int[] arrN = new int[set.size()];
        int index = 0;
        for (int num : set) {
            arrN[index++] = num;
        }

        // 4. Sort the unique array
        Arrays.sort(arrN);

        int max = 1; // Since we checked empty above, min length is now 1

        // 5. Iterate through the sorted unique array
        for (int i = 0; i < arrN.length; i++) {
            int count = 1;

            // Check if the NEXT element is consecutive
            while (i + 1 < arrN.length && arrN[i + 1] - arrN[i] == 1) {
                count++;
                i++; 
            }

            // 6. Update max directly
            if (count > max) {
                max = count;
            }
        }
        
        return max;
    }
}