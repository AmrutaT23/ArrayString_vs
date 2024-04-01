//Find common elements from two arrays (Using HashSet).

import java.util.HashSet;

public class Array9 {
    public static void main(String args[])
    {
        int[] arr1= {2,5,1,8,9};
        int[] arr2 = {3,4,7,1,5};

        HashSet<Integer> hs = new HashSet<>();
        for(int num:arr1)
        {
            hs.add(num);
        }
        for(int num :arr2)
        {
           boolean b =  hs.add(num);
        
            if(b ==false)
            {
                System.out.println(num+" is present in both array");
            }
        }
        
        


    }
    
}
