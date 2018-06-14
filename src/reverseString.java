/**
 * Created by sw on 2018-06-14.
 */
public class reverseString {
    static public String solution(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }

    static public String solution2(String s) {
        //最后一个用例超时
        String ans = "";
        char[] sArr = s.toCharArray();
        for (int i = sArr.length - 1; i >= 0; i--) {
            ans += sArr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(solution(s));
    }
}
