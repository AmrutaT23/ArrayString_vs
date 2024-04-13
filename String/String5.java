// Count total number of words in a string.

public class String5 {
    public static void main(String args[])
    {

        // Method 1
        String s = "What is your name ?";
        String[] new_s = s.split(" ");
        
        System.out.println("Total Number of Words Present in a String :"+new_s.length);

        // Method 2
        String s1 = "Total Number of Words Present in a String ";
        int word =0;

        for(String str : s1.split(" "))
        {
            word++;
        }
        System.out.println("Total Number of Words Present in a String :"+word);
        

        
    }
}
