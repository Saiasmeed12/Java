package strings;

//Print every character of a string.

public class PrintCharacters {
    public static void main(String[] args) {

        String str = "Hello";

        for (char ch : str.toCharArray()) {
            System.out.println(ch);
        }
    }
}