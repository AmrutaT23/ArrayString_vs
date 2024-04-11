// Calculating the sum of elements in rows and columns.

public class Array28 {
    public static void main(String args[])
    {
        int[][] arr= {{2,4,5},{1,6,8},{1,7,0},{1,2,3,}};
        int sum = 0;
        
        //Calculating sum of rows
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                sum += arr[i][j];
                
            }
        }
        System.out.println("Sum of elements in Rows : " +sum);

        // Calculating sum  of column:
        int Total =0;
        for(int j=0;j<arr[0].length;j++)
        {
            for(int i=0;i<arr.length;i++)
            {
                Total += arr[i][j];
            }
            System.out.println("Sum of elements in Column "+j+" is :" +Total);
        }
        
        

    }
}
