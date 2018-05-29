public class addBinary {

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static public String solution(String a, String b) {
        a = reverse(a);
        b = reverse(b);
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        int carry = 0;
        String result = "";
        int i = 0;
        for (i = 0; i < aArr.length && i < bArr.length; i++) {
            result += (aArr[i] - '0' + bArr[i] - '0');
        }
        for (; i < aArr.length; i++) {
            result += aArr[i];
        }
        for (; i < bArr.length; i++) {
            result += bArr[i];
        }
        char[] resultArr = result.toCharArray();
        String ans = "";
        for (int j = 0; j < result.length(); j++) {
            int curNum = (resultArr[j] - '0') + carry;
            if (curNum == 2) {
                ans += '0';
                carry = 1;
            } else if (curNum == 3) {
                ans += '1';
                carry = 1;
            } else {
                ans += curNum;
                carry = 0;
            }
        }
        if (carry == 1) {
            ans += "1";
        }

        return reverse(ans);
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(solution(a, b));
    }
}
