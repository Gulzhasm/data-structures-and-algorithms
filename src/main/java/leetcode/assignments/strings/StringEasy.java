package leetcode.assignments.strings;

public class StringEasy {
    public static void main(String[] args) {
        //3
        //Ab1
        System.out.println(minimumNumber(3, "Ab1"));

    }

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int min = 0;
        int chars = 0, upper = 0, lower = 0, digit = 0;
         String special_characters = "!@#$%^&*()-+";


        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digit++;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                upper++;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lower++;
            }

            if(special_characters.contains(Character.toString(password.charAt(i)))){
                chars++;
            }
        }

        chars = (chars == 0) ? 1 : 0;
        digit = (digit == 0) ? 1 : 0;
        lower = (lower == 0) ? 1: 0;
        upper = (upper == 0) ? 1: 0;





        if(n + min < 6){
            min = min + (6 - (n+min));
        } else {
            min = chars + digit + lower + upper;
        }


        return min;
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
