// Find Missing Number is an Array.

public class Array17 {
    public  void missing_num(int[] array, int n)  //Method with parameter
    {
        int  actualsum=0;  //Local Variable
        int expectedsum = (n*(n+1)/2);

        for(int i :array)
        {
            actualsum = actualsum+i;
        }
        System.out.println("Missing Number in an Array is : "+(expectedsum - actualsum));
    }
    public static void main(String args[])
    {
        Array17 ar = new Array17(); // Object Creation
        int[] array = {1,2,3,4,6};
        ar.missing_num(array, 6);  //Method Called
    }
}
