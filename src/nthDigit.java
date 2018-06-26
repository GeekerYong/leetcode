public class nthDigit {
    static public int findNthDigit(int n) {
        if (n == 0) return 0;
        long digit = 1;
        long carry = 9;
        long sum = 0;
        while (sum < n) {
            sum += digit * carry;
            digit += 1;
            carry *= 10;
        }
        digit--;
        carry /= 10; //恢复以便计算区间开始

        long posStart = 0; //计算数字内位置的开始
        long i = digit - 1;
        long j = carry / 10;
        while (i != 0) {
            posStart = posStart + i * j;
            i--;
            j /= 10;
        }
        posStart = n - posStart;
        long numStart = carry / 9 - 1;

        int ans = 0;
        if (posStart % digit == 0) {
            ans = ("" + (numStart + posStart / digit)).charAt((int) digit - 1) - '0';
        } else {
            ans = ("" + (numStart + posStart / digit + 1)).charAt((int) (posStart % digit) - 1) - '0';
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(1000));
    }
}
