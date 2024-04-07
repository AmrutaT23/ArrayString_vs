// Write a java program to sort names in an array.
import java.util.Scanner;

public class Array22 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter elements of array:");
        String[] arr = new String[n];
        for (int i=0 ;i<n ;i++) 
        {
            arr[i]=sc.nextLine();
        }
        String temp ;

        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
        System.out.println("Sorted Array is:");
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
