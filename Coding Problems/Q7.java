
// 1. Two Sum [Leetcode]

// Q.7 Given an array of integers nums and an integer target, return indices of the two numbers
//  such that they add up to target.

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
     
        int nums[] = {2,3,11,7,15};
        int target = 9;

        int arr[] = approach1(nums, target);
        System.out.println("arr : "+Arrays.toString(nums)+" target : "+target+" indexs : "+Arrays.toString(arr));

        int arr2[] = approach2(nums, target);
        System.out.println("arr : "+Arrays.toString(nums)+" target : "+target+" indexs : "+Arrays.toString(arr2));

    }

public static int[] approach1(int nums[], int target){
    int sum = 0;
    for(int i=0; i<nums.length; i++){
        sum += nums[i];
        for(int j=i+1; j<nums.length; j++){
            if(sum == target) return new int[]{i,j};
        }
    }
    return new int[]{0};
}

public static int[] approach2(int nums[], int target){
    int i=0, j=0;
    int sum = 0;
    while(i<nums.length && j<nums.length){
        sum += nums[j];
        if(sum == target) return new int[]{i,j};
        else if(sum > target){
            sum -= nums[i];
            i++;
        }
        j++;
    }
    return new int[]{0};
}


}
