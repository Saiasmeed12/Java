package strings;

public class CompareStrings {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";

        boolean same = true;

        if (str1.length() != str2.length()) {
            same = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        if (same)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}