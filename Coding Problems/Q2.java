import java.util.Arrays;;

// Q2. Shift all the ZERO's element to the end (right side) of the Array without changing the element sequence.

public class Q2 {
    public static void main(String[] args) {
        
        int arr[] = { 0, 33, 42, 0, 2, 0, 0, 65, 4, 0 };
        int i = 0;

        while (i < arr.length) {
            int j = i;
            if (arr[i] == 0) {
                while (j < arr.length - 1 && arr[j] == 0) {
                    j++;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
        }

        System.out.println("arr : " + Arrays.toString(arr));
    }
}
