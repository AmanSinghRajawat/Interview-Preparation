// 11. Container With Most Water

// Q5. You are given an integer array height of length n. There are n vertical lines drawn 
// such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container 
// contains the most water.

public class Q5 {
    public static void main(String[] args) {
        int []height = {1,8,6,2,5,4,8,3,7};   // O/P : 49

        int i=0, j=height.length-1;
        int water = 0;

        while(i<j){
            int maxWater = (j-i) * Math.min(height[i], height[j]);
            if(water < maxWater) water = maxWater;
            if(height[i] < height[j]) i++;
            else j--;
        }
        System.out.println("water : "+water);
    }
}
