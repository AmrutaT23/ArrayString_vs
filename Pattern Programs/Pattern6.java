/* 
   *
  **
 ***
****
 ***
  **
   *
   
 
   */

public class Pattern6 {
    private static int j;

    public static void main(String[] args) 
    {
        int n = 4;
        for(int i=0; i<n; i++)
        {
            for(int j=n-1; j>i; j--)
            {
                System.out.print(" ");
            }
            
            for(int k=j; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int k=n-1; k>i; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
