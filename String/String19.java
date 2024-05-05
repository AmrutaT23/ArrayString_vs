/* Convert Integer to String in Java */

public class String19
{
    public static void main(String args[])
    {
        int number = 12345;
        String str = Integer.toString(number);

        System.out.println("Using Integer.toString()");
        System.out.println("String is: "+str);

        String str1 = String.valueOf(number);
        System.out.println("Using String.valueOf()");
        System.out.println("String is: "+str1);


        
        
    }
}