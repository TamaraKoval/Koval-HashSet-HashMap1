import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String lorenIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, " +
            "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " +
            "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
            "officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> letterCounter = new HashMap<>();
        String textLetters = onlyLetters(lorenIpsum);

    }

    public static String onlyLetters(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isLetter(currentChar)) {
                sb.append(currentChar);
            }
        }
        String textLetters = sb.toString();
        return textLetters;
    }
}
