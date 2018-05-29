

public class palindromeNumber {
    static public boolean isPalindrome(int x) {
        int revertedNum = 0;
        //负数排除
        //如果末尾是0，那么回文数字的开头是0，符合这种条件的数仅有0.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        while (x > revertedNum) {
            revertedNum = revertedNum * 10 + x % 10;
            x = x / 10;
        }
        // 12321 -> x = 12 revertedNum = 123 -> 12 == 123/10 -> true
        if (x == revertedNum || x == revertedNum / 10) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int x = 1;
        System.out.println(isPalindrome(x));
    }
}
