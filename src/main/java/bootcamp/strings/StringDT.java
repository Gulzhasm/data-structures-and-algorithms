package bootcamp.strings;

public class StringDT {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha hello world";
        // System.out.println(Arrays.toString(name.split("\s")));
        String str = null;
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) { //abcdcba
        if (str == null || str.length() == 0) return true;
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i); //really smart

            if (start != end) {
                return false;
            }
        }
        return true;
    }


    void sb() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
    }
}
