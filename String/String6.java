// write a Java program to determine whether one string is the rotation of another string.

public class String6 {
    public static void main(String args[])
    {
        String s1 = "ABCD";
        String s2 = "CDAB";

        if(s1.length() != s2.length())
        {
            System.out.println("Second string is not rotation of first string.");
        }
        else{
            String s3 = s1.concat(s1);
            if(s3.indexOf(s2) != -1)
            {
                System.out.println("Second string is rotation of first string.");
            }
            else{
                System.out.println("Second string is not rotation of first string.");
            }
        }


    }
}
