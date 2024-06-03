// Asked in Facebook Interview.

// Q8. You are given an unsorted array, which contains elements and number of INFINITY sign 
// at the end of the array. your task is to return the first index of INFINITY sign.

// Approach : Modified Binary Search

public class Q8 {
    public static void main(String[] args) {

        // int nums[] = {-24,40,55,1,2,27,-89,INFINITY,INFINITY,INFINITY}; INFINITY = MAX_VALUE
        
        int nums[] = {-24,40,55,1,2,27,-89,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};  // O/P : 7

        System.out.println(modifiedBinarySearch(nums));
    }

    public static int modifiedBinarySearch(int nums[]){
        
        int left=0, right=nums.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] < Integer.MAX_VALUE) left = mid+1;
            else if(nums[mid] == Integer.MAX_VALUE) right = mid-1;
        }
        return left;
    }
}
