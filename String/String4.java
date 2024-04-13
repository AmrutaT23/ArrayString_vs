// Count the number of vowels present in a string.

public class String4 {
    public static void main(String args[])
    {
        String s = "I love this country";
        int vowel = 0;
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A'|| s.charAt(i) == 'e'|| s.charAt(i) == 'E'||s.charAt(i) == 'i'|| s.charAt(i) == 'I' ||  s.charAt(i) == 'o'|| s.charAt(i) == 'O'|| s.charAt(i) == 'u'||s.charAt(i) == 'U')
            {
                vowel++;
            }
        }

        System.out.println("Total Number of Vowels Presenr in a String :" +vowel);
    }
}
