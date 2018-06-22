/**
 * Created by sw on 2018-06-22.
 */
public class validPerfectSquare {
    static public boolean isPerfectSquare(int num) {
        //枚举法超时
//        for (int i = 0; i <= num; i++) {
//            if (i * i == num){
//                return true;
//            }
//        }
        //奇数差法
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }
}
