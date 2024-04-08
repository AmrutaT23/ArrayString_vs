// Sort array using sort() method.
import java.util.Arrays;
public class Array26 {
    public static void main(String args[])
    {
        int[] arr = {3,2,6,9,1,2,7,0};

        Arrays.sort(arr);
        System.out.println("Sorted array is:");
        for(int i=0;i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
