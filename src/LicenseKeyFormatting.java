import java.util.Stack;

/**
 * Created by sw on 2018-07-06.
 */
public class LicenseKeyFormatting {
    static public String solution(String s, int K) {
        //时间超出限制
        s = s.replaceAll("-", "");
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            stk.push(s.charAt(i));
        }
        String ans = "";
        int cnt = 0;
        while (!stk.empty()) {
            char cur = stk.pop();
            if (cur >= 'a' && cur <= 'z') {
                cur = (char) ((int) (cur - 'a') + 'A');
            }
            ans = cur + ans;
            cnt++;
            if (cnt == K) {
                ans = "-" + ans;
                cnt = 0;
            }
        }
        if (ans.length() != 0 && ans.charAt(0) == '-') {
            ans = ans.substring(1);
        }

        return ans;
    }

    static public String solution2(String S, int K) {
        StringBuilder result = new StringBuilder();
        int countK = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            char letter = S.charAt(i);
            if (letter != '-') {
                result.append(letter);
                countK++;
                if (countK == K) {
                    result.append('-');
                    countK = 0;
                }
            }
        }
        if (result.length() != 0 && result.charAt(result.length() - 1) == '-') {
            result.deleteCharAt(result.length() - 1);
        }
        return result.reverse().toString().toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(solution2("5F3Z-2e-9-w", 4));
    }

}
