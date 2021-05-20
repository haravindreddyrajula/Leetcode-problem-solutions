public class MaximumAverageSubarrayI {
    
    static double findMaxAverage(int[] nums, int k) {
        double avg =  -Double.MAX_VALUE;
        for (int i = 0; i < nums.length -k +1; i++){
            int temp = 0;
            for (int j = i; j < k+i; j++)
                temp += nums[j];
            double avg1 =(double) temp/k;
            avg = Math.max(avg, avg1); 
        }
        return avg;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }  
}