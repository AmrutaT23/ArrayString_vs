// Write a Java program to sort an array of strings in alphabetical order.
import java.util.*;
public class String13 {
    
    public static void main(String args[])
    {
        String[] s = {"Ja","Ra","Ta","Aa","Ga","Va","Za"};
       
        for(int i = 0; i<s.length; i++)
        {
            for(int j=i+1; j<s.length; j++)
            {
                if(s[i].compareTo(s[j]) >0 )
                {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        for(int i=0;i<s.length;i++)
        {
           System.out.print(s[i]+" ");
        }
    }
}


// Using Sort Method
// public class Array13{
//     public static void main(String args[])
//     {
//         char[] arr = {'D','S','E','F','X'};
//         Arrays.sort(arr);
        
//         for(int i=0;i<arr.length;i++)
//                 {
//                    System.out.print(arr[i]+" ");
//                 }
//     }
// }
   



