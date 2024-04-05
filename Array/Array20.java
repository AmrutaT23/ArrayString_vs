// Find the maximum difference between elements in array.

import java.util.Scanner;

public class Array20 {
    public static void main(String args[])
    {
        int n, Max, Min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");

        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        Max = arr[0];
        Min = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] >Max)
            {
                Max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < Min)
            {
                Min = arr[i];
            }
        }
        System.out.println("Maximum :"+Max);
        System.out.println("Minimun :"+Min);
        System.out.println("Maximum Difference :"+(Max-Min));
    }
    
}
