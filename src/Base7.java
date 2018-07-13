public class Base7 {

    static public String solution(int num) {
        if (num == 0) return "0";
        String ans = "";
        boolean flag = false;
        if (num < 0) {
            flag = true;
        }
        num = Math.abs(num);
        while (num != 0) {
            ans = Integer.toString(num % 7) + ans;
            num = num / 7;
        }
        if (flag) {
            ans = "-" + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(100));
    }
}
