package strings;

//Print characters at even indices.

public class EvenIndices {
    public static void main(String[] args) {

        String str = "Hello";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(str.charAt(i));
            }
        }
    }
}