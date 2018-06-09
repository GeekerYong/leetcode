public class addDigits {

    static public int solution(int num) {
        int res = num;
        while (true) {
            if (res < 10) return res;
            num = res;
            res = 0;
            while (num != 0) {
                res += num % 10;
                num = num / 10;
            }
        }
    }

    static public int solution2(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(solution2(num));
    }
}
