package strings;

public class CountCharacters {
    public static void main(String[] args) {

        String str = "Hello World";

        int count=0;

        for (char ch:str.toCharArray()) {
            count++;
        }

        System.out.println("Number of characters = " +count);
    }
}