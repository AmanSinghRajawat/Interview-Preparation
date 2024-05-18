import java.util.Arrays;

// Q1 Shift all the ZERO's element to the end (right side) of the Array.

public class Q1{
    public static void main(String[] args) {
        
        int arr[] = { 0, 33, 42, 0, 2, 0, 0, 65, 4, 0 };
        int i = 0, j = arr.length-1;

        while (i < j) {
            if(arr[i] != 0) i++;
            else if(arr[j] == 0) j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println("arr : " + Arrays.toString(arr));
    }
}
