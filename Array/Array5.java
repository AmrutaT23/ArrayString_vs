// Find  first duplicate element in an array.
public class Array5{
    public static void main(String args[])
    {
        int[] arr = {6,3,1,5,2,0,2,6};
        int temp =0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j] && (i!=j))
                {
                    System.out.println("Duplicate Element is:"+arr[j]+" ");
                    temp++;
                    break;
                }
            }
            if(temp>0)
            {
                break;
            }
        }
    }
}
