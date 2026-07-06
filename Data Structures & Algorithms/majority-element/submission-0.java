class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int mE = -1;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                mE = nums[i];
            }
            
            if(nums[i] == mE)
                count++;
            else
                count--;
        }
        return mE;
    }
}