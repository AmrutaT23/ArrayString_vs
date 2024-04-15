// Write a program to check whether a number is palindrome.

public class String10 {
   

    public static void main(String args[])
    {
        int num =121;
        int reverse = 0;
         

        while(num>0)
        {
            int rem = num%10;
            reverse = reverse*10+rem;
            num =num/10;
        }
        if(num==reverse)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
