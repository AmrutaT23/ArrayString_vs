// Check if two strings are Anagram

import java.util.*;

public class String16 {
    public String check(String s1, String s2)
    {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if(Arrays.equals(str1, str2))
        {
            return "Anagram";
        }
        else
        {
            return "Not Anagram";
        }
    }
    public static void main(String args[])
    {
        String16 s16 =new String16();
        String val = s16.check("Amruta", "silent");
        System.out.println(val);
    }
}
