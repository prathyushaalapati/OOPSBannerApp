import java.util.HashMap;
import java.util.Map;

public class UC8 {
    static Map<Character, String[]> patternMap = new HashMap<>();

    public static void loadPatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }
    public static void renderBanner(String word) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < word.length(); j++) {

                char ch = word.charAt(j);

                if (patternMap.containsKey(ch)) {
                    System.out.print(patternMap.get(ch)[i] + "  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        loadPatterns();          // load patterns into map
        String word = "OOPS";    // banner word
        renderBanner(word);      // print banner
    }
}