/*
        *******
         *****
          ***
           *
*/

public class Pattern9 {
    public static void main(String args[])
    {
        int n = 7;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n-1; k>=(i*2); k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
