// // Write a Java program to find duplicate characters in a string.

public class String7 {
    public static void main(String args[]) {
        String str = "amrutam thakare";
        char[] ch = str.toCharArray();

        System.out.println("Duplicate characters are:");

        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j] && ch[i] != ' ' && ch[i] != '0') {
                    count++;
                    ch[j] = '0';
                }
            }
            if (count > 1 && ch[i] != '0') {
                System.out.println(ch[i]);
                
            }
        }
    }
}
