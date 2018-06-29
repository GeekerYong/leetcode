import java.util.Arrays;

/**
 * Created by sw on 2018-06-29.
 */
public class assignCookies {
    static public int solution(int[] g, int[] s) {
        //首先排序
        Arrays.sort(g);
        Arrays.sort(s);
        boolean[] flag = new boolean[s.length];
        for (int i = 0; i < flag.length; i++) {
            flag[i] = false;
        }
        //贪心的给小饼干
        int ans = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < flag.length; j++) {
                if (!flag[j] && s[j] >= g[i]) { //饼干未被使用且满足
                    ans++;
                    flag[j] = true;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] g = new int[]{10, 9, 8, 7};
        int[] s = new int[]{5, 6, 7, 8};
        System.out.println(solution(g, s));
    }
}
