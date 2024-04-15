// Write a Java program to find whether a string is palindrome.

public class String9 {
    public static void main(String args[])
    {
        String s ="mom";
        String str = "";

        for(int i=s.length()-1; i>=0;i--)
        {
            str = str +s.charAt(i);
        }

        if(s.equalsIgnoreCase(str))
        {
            System.out.println("Given String is Palindrome");
        }
        else
        {
            System.out.println("Given String is not Palindrome");
        }

    }
}
