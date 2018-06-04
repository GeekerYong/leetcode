/**
 * Created by sw on 2018-06-04.
 */
public class validPalindrome {

    static public boolean isAlphaNum(char ch) {
        if (ch >= 'a' && ch <= 'z') return true;
        if (ch >= '0' && ch <= '9') return true;
        return false;
    }

    static public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        s = s.toLowerCase(); //小写
        s = s.replace(" ", "");//去除空格
        char[] sArr = s.toCharArray();
        boolean ans = true;

        boolean inclAlpNum = false;
        for (int i = 0; i < sArr.length; i++) {
            if (isAlphaNum(sArr[i])) {
                inclAlpNum = true;
            }
        }
        if (!inclAlpNum) {
            return true;
        }

        for (int i = 0, j = sArr.length - 1; i <= j; i++, j--) {
            while (!isAlphaNum(sArr[i])) {
                i++;
            }
            while (!isAlphaNum(sArr[j])) {
                j--;
            }

            if (sArr[i] != sArr[j]) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "race a car";

        System.out.println(isPalindrome(s));
    }
}
