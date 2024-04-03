// Insert element in an array.
public class Array12 {
    public static void main(String args[])
    {
        int[] arr ={30,20,40,90,50};
        int pos = 3;
        int element = 120;

        for(int i=arr.length-1; i > pos-1; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos-1]=element;
        
        System.out.println("Array After Insertion:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
