// Find pair with given sum in an array.

public class Array24 {
    public static void main(String args[])
    {
        int[] arr = {2,5,3,6,7,1};
        int sum =6;

        for(int i=0;i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[j] == sum-arr[i])
                {
                    System.out.println(arr[i]+ ","+arr[j]);
                }
            }
        }
    }
}
