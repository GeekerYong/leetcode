/**
 * Created by sw on 2018-06-05.
 */
public class excelSheetColumnTitle {
    static public String convertToTitle(int n) {
        //本质上是10进制数转换为26进制数的过程，除26取余，再对应数字即可。
        String ans = "";
        while (n > 0) {
            char s = (char) ((n - 1) % 26 + 'A');
            ans = s + ans;
            n = (n - 1) / 26;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println(convertToTitle(n));
    }
}
