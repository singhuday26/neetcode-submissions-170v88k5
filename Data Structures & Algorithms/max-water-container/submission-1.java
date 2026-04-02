class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxArea = -1;

        for(int i = 0; i < n; i++){
            int a = heights[i];


            for(int j = i + 1; j < n; j++){

               //Avoid rolling min ( means min between the two bars)
               //Only 'exact' 2 bars are needed for min calculation everytime                                        
                                                      
                int min = Math.min(a, heights[j]);   //comparison with initial bar (a)
                    
                
                int width = j - i; 
                int area = min * width;

                if(area > maxArea)
                    maxArea = area;
            }
        }

        return maxArea;
        
    }
}
