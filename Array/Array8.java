//Find common elements from two arrays (Using nested for loop).

public class Array8 {
    public static void main(String args[])
    {
        int[] arr1= {2,5,1,8,9};
        int[] arr2 = {3,4,7,1,5};

        System.out.println("Duplicate Numbers are: ");
        for(int i=0;i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.println(arr1[i]);
                }
            }
        }

    }
    
}



