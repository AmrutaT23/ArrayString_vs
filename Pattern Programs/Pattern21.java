/*
        1 2 3
        6 5 4
        7 8 9
        12 11 10
        13 14 15
*/

public class Pattern21 {
    public static void main(String args[])
    {
        int count =0;
        int n=5;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                for(int j=1;j<=3;j++)
                {
                    count++;
                    System.out.print(count + " ");
                }
            }
            else
            {
                int temp =count+1;
                for(int k=count+3;k>=temp;k--)
                {
                    count++;
                    System.out.print(k+" ");
                }
            }
            
            System.out.println();
        }
    }
}
