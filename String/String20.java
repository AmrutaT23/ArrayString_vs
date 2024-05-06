/*Convert Float to String in Java */

public class String20 {
    public static void main(String args[])
    {
        float  float_var = 12.4334f;
        String str = Float.toString(float_var);

        System.out.println("Float value :"+float_var);
        System.out.println("String value :"+str);

        String str1 = String.format("%.2f",float_var);
        System.out.println("Float value :"+float_var);
        System.out.println("String value :"+str1);
    }
}
