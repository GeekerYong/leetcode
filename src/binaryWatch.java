import java.util.ArrayList;
import java.util.List;

public class binaryWatch {
    //思路：进行枚举，将代表小时的四位左移6位然后与代表分钟的6位相加，
    //     然后统计1的个数，只要与num一致就放入输出List。
    static List<String> solution(int num) {
        List<String> ans = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount((h << 6) + m) == num) {
                    ans.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<String> ans = solution(1);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
