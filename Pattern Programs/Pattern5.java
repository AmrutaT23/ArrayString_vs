/*
 ****
  ***
   **
    *
*/

import java.util.*;
public class Pattern5 {
    public static void main(String args[])
    {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
         int n = sc.nextInt();
         sc.close();

         for(int i=1; i<=n; i++)
         {
            for (int k=1; k<=i; k++)
            {
                System.out.print(" ");
            }
            for(int j=n; j>=i;j--)
            {
                System.out.print("*");
            }
            
            System.out.println();
         }
    }
    
}
