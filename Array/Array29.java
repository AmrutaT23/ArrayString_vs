// Take a matrix as input from the user .Search for a gien number x and print the indices at which it occurs.

import java.util.*;
public class Array29 {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter total number of rows");
        int row = sc.nextInt();

        System.out.println("Enter total number of rows");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter  find element");
        int find = sc.nextInt();

        
        for(int i=0;i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
               if(find == arr[i][j])
               {
                System.out.println("Element Fount At Location : "+i +"," +j);
               }
            }
           
        }
        
        
        sc.close();

    }
}
