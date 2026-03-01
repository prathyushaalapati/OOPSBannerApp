public class UC6 {
    public static String[] buildO() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }
    public static String[] buildP() {
        return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
    }
    public static String[] buildS() {
        return new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };
    }
    public static void main(String[] args) {
        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " +
                               o[i] + "  " +
                               p[i] + "  " +
                               s[i]);
        }
    }
}