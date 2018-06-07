public class countPrimes {
    static public int solution(int n) {
        //素数筛法
        boolean[] s = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            s[i] = true;
        }
        s[0] = false;
        s[1] = false; //0 1 不是素数
        for (int i = 2; i < n; i++) {
            for (int j = i * 2; j <= n; j += i) {
                s[j] = false;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == true) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(2));
    }
}
