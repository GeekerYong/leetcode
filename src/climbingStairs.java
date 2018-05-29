public class climbingStairs {
    static public int solution(int x) {
        int a = 1;
        int b = 1;
        int temp = 0;
        for (int i = 0; i < x; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int x = 3;
        System.out.println(solution(x));
    }
}
