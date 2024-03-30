//Find the maximum & minimum value in an array.

class Array2{
    public static void main(String args[])
    {
       int [] arr = {4,9,2,7,5,1,10};

       int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum  Value is : "+max);

        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<max)
            {
                max=arr[i];
            }
        }
        System.out.println("Minimum  Value is : "+max);
        
    }
}

