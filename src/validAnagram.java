import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by sw on 2018-06-09.
 */
public class validAnagram {
    static public boolean isAnagram(String s, String t) {
        HashMap<Character, Boolean> check = new HashMap<>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        String s_sort = sArr.toString();
        String t_sort = tArr.toString();

        if (s_sort.equals(t_sort)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

}
