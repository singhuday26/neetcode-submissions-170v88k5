class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = res[1] = -1;

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int t = target - n;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == t){
                    res[0] = i; 
                    res[1] = j;
                    return res;
                }
            }
        }

        return res;
    }
}
