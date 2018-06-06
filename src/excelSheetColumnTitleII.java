/**
 * Created by sw on 2018-06-06.
 */
public class excelSheetColumnTitleII {
    static public int titleToNumber(String s) {
        int ans = 0;
        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            char curChar = sArr[i];
            ans = ans * 26 + (curChar - 'A' + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}
