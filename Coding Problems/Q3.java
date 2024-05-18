import java.util.Arrays;

// Q3 you are given a 2D Array (Matrix) and a integer variable target. in a 2D Array Each row shorted in assending order. you have find the target element in the 2D array.

public class Q3{
    public static void main(String args[]){
        
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 34;

        for(int i=0; i<matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("target : "+target);

        int bruteForceApproach[] = bruteForce(matrix, target);
        System.out.println("Approach 1 -> Brute Force : "+Arrays.toString(bruteForceApproach));

         System.out.println("-----------------------------------");

        int result[] = approach2(matrix, target);
        System.out.println("Approach 2 -> Modified Binary Search : "+Arrays.toString(result));

        System.out.println("-------------------------------------");

        int answer[] = approach3(matrix, target);
        System.out.println("Approach 3 -> Binary Search : "+Arrays.toString(answer));

    }


// Approach 1 : Brute Force

    public static int[] bruteForce(int matrix[][], int target){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }



// Approach 2 : Optimized - Binary Search Tree

    public static int[] approach2(int matrix[][], int target){
        for(int i=0; i<matrix.length; i++){
            int mid = i + (matrix.length-i-1)/2;
            if(matrix[i][mid] == target){
                return new int[]{i,mid};
            }else if(matrix[i][mid] > target ){
                for(int j=mid-1; j>=0; j--){
                    // System.out.println(" i : "+i+" j : "+j);
                    if(matrix[i][j] == target) return new int[]{i,j};
                }
            }else{
                for(int j=mid+1; j<matrix[i].length; j++){
                    // System.out.println(" I : "+i+" J : "+j);
                    if(matrix[i][j] == target) return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }


// Approach 3 : Optimized - Compairing target element with the last element of each row.

    public static int[] approach3(int [][]matrix, int target){

        int i=0;
        while(i<matrix.length){
            // System.out.println(" i : "+i);
            if(matrix[i][matrix.length-1] < target){
                i++;
            }else{
                return new int[]{i,binarySearch(matrix[i], target)};
            }
        }
        return new int[]{-1};
    }


    public static int binarySearch(int matrix[], int target){
        int i=0, j=matrix.length-1;
        while(i<j){
            // System.out.println(" i : "+i+" j : "+j);
            int mid = i + (j-i)/2;
            if(matrix[mid] == target) return mid;
            else if(matrix[i] < target) i=mid+1;
            else j = mid-1;
        }
       return -1;
    }

}