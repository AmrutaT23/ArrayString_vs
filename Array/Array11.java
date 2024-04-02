
//Find longest consecutive sequence in an array.
import java.util.HashSet;

public class Array11 {
    public static  void main(String args[])
    {
        int[] arr ={3,9,1,10,4,20,2};

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++)
        {
            hs.add(arr[i]);
        }
        int long_leng = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(!hs.contains(arr[i]-1))
            {
                int num = arr[i];
                while(hs.contains(num))
                {
                    num++;
                }
                if(long_leng<num-arr[i])
                {
                    long_leng = num-arr[i];
                }
            }
        }
        System.out.println("Longest  Seq. Length is: "+long_leng);
    }
}
