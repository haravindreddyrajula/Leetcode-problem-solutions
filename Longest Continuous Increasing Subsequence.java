class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currLength = 1;
        int prevNum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prevNum) {
                currLength++;
                prevNum = nums[i];
                
                if (maxLength < currLength) {
                    maxLength = currLength;
                }
                
                continue;
            }
            
            currLength = 1;
            prevNum = nums[i];
        }
        
        return maxLength;
    }
}