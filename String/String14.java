// Write a Java program to determine the frequency of characters in the String.

public class String14 {
    public static void main(String args[])
    {
        String s ="Welcome to Yavatmal";

        String str = s.toLowerCase();
        int count = 0;
        char ch ='a';

        for(int i=0; i<str.length() ; i++)
        {
            char a;
            if(ch == str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Frequency of Character "+ch+" is : "+count);
    }
}
