// Program to Remove Spaces from a String.

class String15{
    public static void main(String args[])
    {
        String s = "I am amruta thakare";
        String str = s.replace(" ", "");
        System.out.println("Using Replace Method : "+str);

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != ' ')
            {
                System.out.print(s.charAt(i));
            }
        }

       

    }
}
