public class ConstructTheRectangle {
    static public int[] solution(int area) {
        //遍历法，时间复杂度较高
        int[] ans = new int[]{0, 0};
        int mins = Integer.MAX_VALUE;
        for (int w = 1; w <= area; w++) {
            for (int l = 1; l <= area; l++) {
                if (w * l != area) {//条件1
                    continue;
                } else {
                    if (l < w) {//条件2
                        continue;
                    } else {
                        if (Math.abs(w - l) < mins) {
                            ans[0] = l;
                            ans[1] = w;
                            mins = Math.abs(w - l);
                        }
                    }
                }
            }
        }
        return ans;
    }

    static public int[] solution2(int area) {
        //分析法，最优解一定出现在x*x=area附近，虽然x这样的整数不一定存在，但附近一定能找到一个符合这样结构的等式，即为最优解
        int x = (int) Math.ceil(Math.sqrt(area));
        while (area % x != 0) {
            x++;
        }
        int y = area / x;
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        int[] ans = solution2(10000000);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}