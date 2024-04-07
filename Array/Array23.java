// Find majority element in an array.

public class Array23 {
    public int majorityEle(int arr[]) 
    {
        for(int i=0;i<arr.length;i++)
        {
            int count = 1;
            for(int j=0; j<arr.length ;j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(count >arr.length/2)
            {
                return arr[i];
            }
            
        }
        return -1;
    }
    public static void main(String args[])
    {
        int[] arr = {1,3,4,6,3,7,3,8,3};
        Array23 ar23 = new Array23();
        int element = ar23.majorityEle(arr);
        System.out.println("The element with the majority is : "+element);
    }
}
