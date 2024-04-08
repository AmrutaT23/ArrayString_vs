// Copy arrays using Arrays.copyOf() method.
import java.util.*;
public class Array25 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] old_array = new int[n];
        System.out.println("Enter elements of original array:");
        for (int i=0;i<n;i++)
        {
            old_array[i] = sc.nextInt();
        } 
            
        int[] new_array = Arrays.copyOf(old_array,old_array.length);

        System.out.println(("Given Copy Array is :"));
        for(int i=0 ; i<new_array.length;i++)
        {
            System.out.println(new_array[i]);
        }
    }
}
