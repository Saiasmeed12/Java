package strings;

public class CountUpperAndLower {
    public static void main(String[] args) {

        String str = "HellO WoRld";

        int upper=0;
        int lower=0;

        for (char ch:str.toCharArray()) {

            if (ch >='A'&&ch <='Z') 
            {
                upper++;
            }
            else if (ch >='a' && ch <='z') 
            {
                lower++;
            }
        }

        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
    }
}