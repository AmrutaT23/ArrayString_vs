// Delete duplicate element from an  array using HastSet.

import java.util.HashSet;

public class Array15 {
    public static void main(String args[])
    {
        int[] arr = {3,4,9,1,2,4,6};

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        System.out.println("Array elements are : ");
        for(int ele:hs)
        {
            System.out.println(ele);
        }
    }
}
