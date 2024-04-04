// Merge two arrays.
public class Array16 {
    public static void main(String args[])
    {
        String[] arr1 = {"A","B","C","5","6"};
        String[] arr2 = {"7","8","9","10"};
        String[] temp = new String[arr1.length+arr2.length];
        
        for(int i=0; i<arr1.length; i++)
        {
            temp[i]  = arr1[i];
        }
        for(int j=0; j<arr2.length; j++)
        {
            temp[j+arr1.length]  = arr2[j];
        }
        System.out.println("Array after merging: ");
        for(int k=0;k <temp.length ;k++ )
        {
            System.out.println(temp[k]);
        }
    }
}
