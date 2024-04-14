// Write a Java program to find the duplicate words in a string.

public class String8 {
    public static void main(String args[])
    {
        String s = "Love life love his life his";
        
        String[] s1 = s.split(" ");

        for(int i=0; i<s1.length; i++)
        {
            int count =0;
            for(int j =i+1;j<s1.length; j++)
            {
                if(s1[i].equals(s1[j]))
                {
                    // System.out.println("Duplicate Elements are :"+s1[j]);
                    count++;
                    s1[j] ="0";

                }
            }
            if(count>0 && s1[i] !="0")
            {
                System.out.println("Duplicate Word is :"+s1[i]);
            }
        }
    }
}
