package strings;

//Print characters at odd indices.

public class OddIndices {
    public static void main(String[] args) {

        String str = "Hello";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                System.out.println(str.charAt(i));
            }
        }
    }
}