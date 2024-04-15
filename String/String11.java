// Write a program to reverse a string in Java.

public class String11 {
    public static void main(String args[])
    {
        String str = "yavatmal";

        String str1 ="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1 = str1 + str.charAt(i);
            
        }
        System.out.println("Original String :"+str);
        System.out.println("Reverse String :"+str1);
        
    }
}
