

public class romanToInteger {
    static public int romanToInt(String s) {
        int ans = 0;
        int pre = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = 0;
            switch (s.charAt(i)) {
                case 'M':
                    num = 1000;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'I':
                    num = 1;
                    break;
                default:
                    continue;
            }
            if (num < pre) {
                ans = ans - num;
            } else {
                ans = ans + num;
            }
            pre = num;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "IV";
        System.out.println(romanToInt(s));
    }
}
