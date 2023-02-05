import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String LOREN_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, " +
            "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " +
            "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
            "officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        String textLetters = onlyLetters(LOREN_IPSUM);
        Map<Character, Integer> letterCounter = letterCounter(textLetters);

        searchMinValue(letterCounter);
        searchMaxValue(letterCounter);
    }

    public static String onlyLetters(String str) {
        String textLetters;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isLetter(currentChar)) {
                sb.append(currentChar);
            }
        }
        textLetters = sb.toString().toLowerCase();
        return textLetters;
    }

    private static Map<Character, Integer> letterCounter(String str) {
        Map<Character, Integer> letterCounter = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!letterCounter.containsKey(currentChar)) {
                letterCounter.put(currentChar, 1);
            } else {
                int newValue = letterCounter.get(currentChar) + 1;
                letterCounter.put(currentChar, newValue);
            }
        }
        return letterCounter;
    }

    private static void searchMaxValue(Map<Character, Integer> map) {
        int max = 0;
        char maxCh = ' ';
        for (Map.Entry<Character, Integer> kv: map.entrySet()) {
            if (kv.getValue() > max) {
                max = kv.getValue();
                maxCh = kv.getKey();
            }
        }
        System.out.println("Чаще всего встречается буква " + maxCh + ": " + max);
    }

    private static void searchMinValue(Map<Character, Integer> map) {
        int min = Integer.MAX_VALUE;
        char minCh = ' ';
        for (Map.Entry<Character, Integer> kv: map.entrySet()) {
            if (kv.getValue() < min) {
                min = kv.getValue();
                minCh = kv.getKey();
            }
        }
        System.out.println("Чаще всего встречается буква " + minCh + ": " + min);
    }
}
