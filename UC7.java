import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    private static Map<Character, CharacterPatternMap> patternMap = new HashMap<>();
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
    static {
        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));
        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        }));
        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));
    }
    public static void displayBanner(String text) {

        int patternHeight = 5;
        StringBuilder banner = new StringBuilder();

        for (int row = 0; row < patternHeight; row++) {

            for (char ch : text.toCharArray()) {

                CharacterPatternMap cp = patternMap.get(ch);

                if (cp != null) {
                    banner.append(cp.getPattern()[row]).append("  ");
                }
            }

            banner.append("\n");
        }

        System.out.println(banner);
    }

    public static void main(String[] args) {

        String word = "OOPS";
        displayBanner(word);

    }
}