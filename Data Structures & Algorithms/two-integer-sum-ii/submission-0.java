class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int[] resN = {-1, -1};
        for(int i = 0; i < numbers.length; i++){
            int n1 = numbers[i];
            int  n2 = target - n1;

            res[0] = i + 1;

            for(int j = i + 1; j  <numbers.length; j++){
                if(n2 == numbers[j]){
                    res[1] = j + 1;
                    return res;
                }
            }
        }

            return resN;
    }
}
