// Find the element that appears once in array and other element appear twice.
public class Array6 {
    public static void main(String args[]) {
        int[] arr = { 5, 3, 4, 5, 2, 3, 4, 0 }; // Declare and initialize an array of integers.

        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i]; // using XOR
        }
        System.out.println("Single Repeated element is :" + res);

        
    }
}
