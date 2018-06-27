/**
 * Created by sw on 2018-06-27.
 */
public class addStrings {
    static public String reverse(String s) {
        String ans = "";
        char[] sArr = s.toCharArray();
        for (int i = sArr.length - 1; i >= 0; i--) {
            ans = ans + sArr[i];
        }
        return ans;
    }

    static public String solution(String num1, String num2) {
        String ans = "";
        String a = reverse(num1);
        String b = reverse(num2);
        int i = 0;
        int j = 0;
        int carry = 0;
        while (i < a.length() && j < b.length()) {
            int n1 = a.charAt(i) - '0';
            int n2 = b.charAt(j) - '0';
            carry = carry + n1 + n2;
            ans = (char) (carry % 10 + '0') + ans;
            carry = carry / 10;
            i++;
            j++;
        }


        while (i < a.length()) {
            carry = carry + (a.charAt(i) - '0');
            ans = (char) (carry % 10 + '0') + ans;
            carry = carry / 10;
            i++;
        }
        while (j < b.length()) {
            carry = carry + (b.charAt(j) - '0');
            ans = (char) (carry % 10 + '0') + ans;
            carry = carry / 10;
            j++;
        }
        while (carry != 0) {
            ans = (char) (carry % 10 + '0') + ans;
            carry = carry / 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        String num1 = "584";
        String num2 = "18";
        System.out.println(solution(num1, num2));
    }
}
