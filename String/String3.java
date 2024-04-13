// Count the total number of characters present in a string

public class String3 {
    public static void main(String args[])
    {
        String s = "Amruta thakare";
        int count =0;
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            count++;
        }
        System.out.println("Total Number of Characters Present In a String is :"+ count);

    }
}
