/*
            *
           ***
          *****
         *******
*/

public class Pattern8 {
    public static void main(String args[])
    {
        int n =4;
        for(int i=0; i<n; i++)
        {
            for(int j=n-1; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=0; k<=i;k++)
            {
                System.out.print("*");
            }
            for(int l=1; l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}