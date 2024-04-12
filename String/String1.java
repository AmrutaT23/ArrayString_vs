//  Print even length words in a String

public class String1
{
    public static void main(String args[])
    {
        String s = "Hello World! Good Morning";
        
        String[] arr = s.split(" ");
        String[] arr1 = s.split("o");

        for(int i=0; i<arr.length; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println("----------------------------------");
        for(int i=0; i<arr1.length; i++)
        {
           System.out.println(arr1[i]);
        }


    }
}