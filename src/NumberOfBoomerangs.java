import sun.misc.resources.Messages_pt_BR;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sw on 2018-06-28.
 */
public class NumberOfBoomerangs {

    static public int calDistance(int[] x, int[] y) {
        int x1 = y[0] - x[0];
        int x2 = y[1] - x[1];
        return x1 * x1 + x2 * x2;
    }


    static public int solution(int[][] points) {
        int ans = 0;
        Map<Integer, Integer> equalcount = new HashMap<>();//使用map保存距离相等的个数
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                int dis = calDistance(points[i], points[j]);
                equalcount.put(dis, equalcount.getOrDefault(dis, 0) + 1);
            }

            for (int count : equalcount.values()
                    ) {
                ans += count * (count - 1);
            }
            equalcount.clear();
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
