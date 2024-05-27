import java.util.Arrays;

public class Q4{
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};    // O/P [24,12,8,6]
        int product[] = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int temp = 1;
            for(int j=0; j<nums.length; j++){
                if(j!=i) temp *= nums[j];
            }
            product[i] = temp;
        }
        System.out.println("I/P "+Arrays.toString(nums));
        System.out.println("O/P "+Arrays.toString(product));
    }
}