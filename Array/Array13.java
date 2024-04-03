// Delete element from an array.(Index Position)

public class Array13 {
    public static void main(String args[]) {
        int[] arr = { 10, 20, 30, 40, 50 };

        int index = 2;
        System.out.println("Array  deletion : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[i] = arr[i + 1];
                }
            }
        }
        
        for (int i = 0; i < arr.length-1; i++) 
        {
            System.out.println(arr[i]);
        }

        // Delete element from an array.

        int[] arr1 = { 10, 20, 30, 40, 50 };

        int ele =40;
        int count = 0;
        System.out.println("Array  deletion : ");
        for (int i = 0; i < arr1.length; i++) {
            if (ele == arr1[i]) {
                for (int j = i; j < arr1.length - 1; j++) {
                    arr1[i] = arr1[i + 1];
                }
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("Element not found");
        }
        else
        {
            for (int i = 0; i < arr1.length-1; i++) 
        {
            System.out.println(arr1[i]);
        }
        }
        
    }
}
