/*Java Program to Swap Two Strings */


public class String18 {
    public static void main(String args[])
    {
        String a= "Amruta";
        String b="Thakare";

        System.out.println("Without Using Temporary Variablle");
        System.out.println("Before Swapping");
        System.out.println("Value of a is :"+a);
        System.out.println("Value of b is :"+b);

        a = a+b;
        b=a.substring(0 , a.length()- b.length());
        a=a.substring(b.length());

        System.out.println("After Swapping");
        System.out.println("Value of a is :"+a);
        System.out.println("Value of b is :"+b);


    }    
}
