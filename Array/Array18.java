// Segregate  0s and 1s in an array.
public class Array18 {
    public static void main(String args[])
    {
        int[] arr = {0,1,0,0,1,1};

        int j =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                arr[j++]=arr[i];
            }
        }
        while(j<arr.length)
        {
            arr[j++] =1;
        }
        System.out.println("Segregate Array is :");
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]+" ");
        }
    }
}
