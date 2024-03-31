// Find duplicate element in an array.
public class Array4 {
    public static void main(String args[])
    {
        int[] arr = {2,8,4,11,9,4,3,11};

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j] && (i!=j))
                {
                    System.out.println("Duplicate Element is:"+arr[j]+" ");
                    
                }
            }
        }
    }
}
