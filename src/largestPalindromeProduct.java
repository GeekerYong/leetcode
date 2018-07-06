import java.util.Stack;

/**
 * Created by sw on 2018-07-06.
 */
public class largestPalindromeProduct {
    //解法超时
    static public boolean isPalindrome(long n) {
        Stack<Character> stk = new Stack<Character>();
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            stk.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            char stkChar = stk.pop();
            char curChar = str.charAt(i);
            if (stkChar != curChar) {
                return false;
            }
        }
        return true;
    }

    static public int solution(int n) {
        int max = 1;
        while (n != 0) {
            max *= 10;
            n--;
        }
        max--;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j <= max; j++) {
                long result = i * j;
                if (isPalindrome(result)) {
                    if (result > ans) {
                        ans = (i % 1337) * (j % 1337) % 1337;
                    }
                }
            }
        }

        return ans;
    }


    static public int solution2(int n) {
        if (n == 1) return 9;
        // 當n>1時，兩個n位數乘積的最大回文數一定是2n位的
        int maxValue = (int) Math.pow(10, n) - 1;
        int minValue = maxValue / 10;
        for (int i = maxValue; i > minValue; i--) {
            long parNum = createPar(i);
            for (int j = maxValue; j > minValue; j--) {
                if (parNum / j > maxValue) {
                    break;
                }
                if (parNum % j == 0) {
                    return (int) (parNum % 1337);
                }
            }
        }
        return -1;
    }

    static public long createPar(int num) {
        String str = String.valueOf(num);
        for (int i = str.length() - 1; i >= 0; i--) {
            str += str.charAt(i);
        }
        long ans = Long.parseLong(str);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution2(2));
    }

}
