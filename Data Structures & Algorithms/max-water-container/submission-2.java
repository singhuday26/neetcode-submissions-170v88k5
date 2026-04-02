class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            // 1. Calculate the current area
            int width = right - left;
            int h = Math.min(heights[left], heights[right]);
            int currentArea = h * width;

            // 2. Update global maximum
            maxArea = Math.max(maxArea, currentArea);

            // 3. Move the pointer pointing to the shorter bar
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}