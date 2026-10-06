package strings;

// Count spaces in a string.

public class CountSpaces {
    public static void main(String[] args) {

        String str = "Hello World Java";

        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                count++;
            }
        }

        System.out.println("Spaces = " + count);
    }
}