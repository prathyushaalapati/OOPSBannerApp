public class UC5{
    public static void main(String[] args) {
        System.out.println("OOPS Banner App");
        System.out.println("UC5: Render OOPS as Banner using Inline Array Initialization\n");
        String[] bannerLines = {
            String.join("", " *****   *****   *****    ***** "),
            String.join("", "*     * *     * *     *  *     *"),
            String.join("", "*     * *     * *     *  *      "),
            String.join("", "*     * *     * *****     ***** "),
            String.join("", "*     * *     * *              *"),
            String.join("", "*     * *     * *        *     *"),
            String.join("", " *****   *****  *         ***** ")
        };
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}