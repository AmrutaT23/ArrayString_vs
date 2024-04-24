/*
        1            1
        22           12
        333          123
        4444         1234
        55555        12345
 */




public class Pattern15 {
    public static void main(String args[])
    {
        int n =5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
            
        }
        System.out.println("------------------");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
}
