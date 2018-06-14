import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

/**
 * Created by sw on 2018-06-14.
 */
public class reverseVowelsOfAString {
    static public String reverseVowels(String s) {
        Stack<Character> alph = new Stack<Character>();
        Queue<Integer> pos = new LinkedList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                alph.push(s.charAt(i));
                pos.add(i);
            }
        }
        char[] sArr = s.toCharArray();
        while (!pos.isEmpty()) {
            int ind = pos.remove();
            char alp = alph.pop();
            sArr[ind] = alp;
        }
        String ans = new String(sArr);
        return ans;
    }

    public static void main(String[] args) {
        String s = "aA";
        System.out.println(reverseVowels(s));
    }
}
