// Move all negative numbers to the start of array and positive numbers to end.

public class Array19 {

    public void rearrange(int[] arr, int[] newarr)
    {
        int j = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] <0 )
            {
                newarr[j] =arr[i];
                j++;
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > 0 )
            {
                newarr[j] =arr[i];
                j++;
            }
        }
        System.out.println("Array after rearrangement : ");
        for(int k=0; k<arr.length; k++)
        {
           System.out.print(newarr[k]+" ");
        }
    }
    public static void main(String args[])
    {
        Array19 ob = new Array19();
        int[] arr = {-3,1,-4,5,-2,-9,5,-4,0};
        int[] newarr = new int[arr.length];
        ob.rearrange(arr, newarr);

    }
}
