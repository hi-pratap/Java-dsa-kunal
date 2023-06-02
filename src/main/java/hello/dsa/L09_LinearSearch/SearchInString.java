package hello.dsa.L09_LinearSearch;

public class SearchInString {

    public static void main(String[] args) {

        String string="pratap";

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'p'){
                System.out.println("Say Hello");
            }


        }

    }
}
