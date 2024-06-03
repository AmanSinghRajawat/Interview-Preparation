// 53. Maximum Subarray   [ Kadane's Algorithm]

// Q.6 Given an integer array nums, find the subarray with the largest sum, and return its sum.

public class Q6 {
    public static void main(String[] args) {
        int []nums = {-2,1,-3,4,-1,2,1,-5,24};  //  [4,-1,2,1] = 6
        
        approach1(nums);

        approach2(nums);
    }

// Approach 1 : Brute Force Approach

    public static void approach1(int nums[]){
        int i=0;
        int maxSum = 0;
        
        while( i < nums.length ){
            int j=i+1;
            int sum = 0;
            while(j<nums.length){
                sum += nums[j];
                if(maxSum < sum) maxSum = sum;
                j++;
            }
            i++;
        }
    System.out.println("maxSum : "+maxSum);
    }

    // Approach 2 : Optimise Approach O(nlogn)

    public static void approach2(int nums[]){

        int i=0,j=0;
        int maxSum = 0;
        int sum = 0;

        while(i<nums.length && j<nums.length){
            sum += nums[j];
            if(sum > maxSum){
                maxSum = sum;
            }
            else if(sum < 0){
                sum = 0;
                i=j;
            }
            j++;
        }
        System.out.println("maxSum : "+maxSum);
    }
}