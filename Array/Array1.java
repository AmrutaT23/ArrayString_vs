//Default initialization  of array elements.

public class Array1 {

    public void Arrayint() {
        System.out.println("Array initialization of int type:");
        int[] arr1 = new int[3]; // local variable
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println("arr1[" + i + "] :" + arr1[i]);
        }
    }

    public void Arrayboolen() {
        System.out.println("Array initialization of boolean type:");
        boolean[] arr2 = new boolean[3]; // local variable
        for (int i = 0; i <= arr2.length - 1; i++) {

            System.out.println("arr2[" + i + "] :" + arr2[i]);
        }
    }

    public void Arraystring() {
        System.out.println("Array initialization of string type:");
        String[] arr3 = new String[3]; // local variable
        for (int i = 0; i <= arr3.length - 1; i++) {

            System.out.println("arr3[" + i + "] :" + arr3[i]);
        }
    }

    public static void main(String args[]) {
        Array1 a = new Array1(); // Instance Creation
        a.Arrayint(); // Method Called
        a.Arrayboolen(); // Method Called
        a.Arraystring(); // Method Called
    }
}