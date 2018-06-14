/**
 * Created by sw on 2018-06-14.
 */
public class nimGame {

    static public boolean solution(int n, boolean mine) {
        // true 代表当前为我的回合
        if (n <= 3) {
            if (mine) {
                return true;
            } else {
                return false;
            }
        }
        mine = !mine;
        return solution(n - 1, mine) || solution(n - 2, mine) || solution(n - 3, mine);
    }

    static public boolean canWinNim(int n) {
        return solution(n, true);
    }

    static public boolean canWinNum2(int n) {
        //找到规律，能被4整出的都不可能赢
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(canWinNim(1348820612));
    }
}
