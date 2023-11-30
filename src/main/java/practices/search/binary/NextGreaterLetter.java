package practices.search.binary;

public class NextGreaterLetter {
    public static void main(String[] args) {
        char target = nextGreaterLetter(new char[]{'c', 'f', 'j', 'k'}, 'a');
        System.out.println(target);
    }

    static char nextGreaterLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < letters[mid]){
                end = mid - 1;
            } else if(target > letters[mid]){
                start = mid + 1;
            }
        }
        return letters[start % letters.length]; // can you elaborate on this mod
    }
}
