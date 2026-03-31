class Solution {

    //first apporach two nested loops, TRY to optimise
    //SUCH questions that CAN be optimised

    public int[] productExceptSelf(int[] nums) {
        int []result = new int[nums.length];
        int k = 0; 
        
        for(int i = 0; i < nums.length; i++){
            int prod = 1;
            for(int j = 0; j < nums.length; j++){
            
            if(i != j){
            
            prod *= nums[j];

            }

        }

        result[k++] = prod;

        }
        return result;


    }
}  
