//  Two dimensional array.

public class Array27 {
    public static void main(String args[])
    {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println("Dislaying elements of 2D array in a matrix form:");
        for(int i=0; i<4;i++) //outer for loop for rows
        {
            for(int j=0;j<4;j++) //columns in each row
            {
                System.out.print(arr[i][j] +"\t" );
            }
            System.out.println();
        }
    }
}
