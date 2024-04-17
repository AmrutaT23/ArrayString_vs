// Check if a String Contains Only Digits

public class String17 {
    public boolean isDigit(String str) {
        return str.matches("[0-9]+");
    }

    public boolean isAlphabet(String str) { // Check if a String Contains Only Alphabets

        return str.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {
        String17 obj = new String17();
        System.out.println(obj.isDigit("1234"));
        System.out.println(obj.isAlphabet("ahsdjA"));
    }
}
