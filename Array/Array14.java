// Delete duplicate element from an sorted array.

public class Array14 {
    public static void main(String args[])
    {
        int[] arr = {1,2,2,2,3,4,5};
        int[] temp = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] !=arr[i+1])
            {
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j] = arr[arr.length-1]; 
        
        System.out.println("Array after deleting duplicates : ");
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(temp[i]);
        }

    }
}
