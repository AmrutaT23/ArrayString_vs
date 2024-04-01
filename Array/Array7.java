
//Print Even & odd numbers And Print sum of all Even & Odd numbers.
import java.util.ArrayList;

public class Array7 {
    public static void main(String args[]) {
        int[] arr = { 4, 7, 5, 9, 2, 6, 1, 3, 12, 10 };
        ArrayList<Integer> a1 = new ArrayList<>(); // store even numbers
        ArrayList<Integer> a2 = new ArrayList<>(); // store odd numbers

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                a1.add(arr[i]);
            } else {
                a2.add(arr[i]);
            }
        }

        int total1 = 0;
        System.out.println("Even Numbers :");
        System.out.println("Total Number of Even Number's are :" + a1.size());
        for (int num : a1) {
            total1 = total1 + num;
            System.out.println(num + " ");
        }
        System.out.println("Sum of all even numbers are :" + total1);
        System.out.println("-----------------------------------------------");

        int total2 = 0;
        System.out.println("Odd Numbers :");
        System.out.println("Total Number of Odd Number's are :" + a2.size());
        for (int num : a2) {
            total2 = total2 + num;
            System.out.println(num + " ");
        }
        System.out.println("Sum of all odd numbers are :" + total2);

    }
}
