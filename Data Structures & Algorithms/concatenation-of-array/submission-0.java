class Solution {
    public int[] getConcatenation(int[] nums) {
        int m = nums.length;
        int n = m * 2;

        int[]ans = new int[n];

        for(int i = 0; i < n; i++){
            ans[i] = nums[(i + m) % m ];
        }

        return ans;
    }
}