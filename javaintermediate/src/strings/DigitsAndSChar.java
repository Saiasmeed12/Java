package strings;
//Count digits and special characters in a string.

public class DigitsAndSChar {
    public static void main(String[] args) {

        String str = "Hello@123#";

        int digits = 0;
        int special = 0;

        for (char ch : str.toCharArray()) {

            if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (!(ch >= 'A' && ch <= 'Z') &&
                       !(ch >= 'a' && ch <= 'z') &&
                       ch != ' ') {
                special++;
            }
        }

        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + special);
    }
}