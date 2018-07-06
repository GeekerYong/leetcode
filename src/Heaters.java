import java.util.Arrays;

/**
 * Created by sw on 2018-07-06.
 */
public class Heaters {
    static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int ans = 0;
        int startIndex = 0;
        for (int i = 0; i < houses.length; i++) {
            int minDis = Integer.MAX_VALUE;
            for (int j = startIndex; j < heaters.length; j++) {
                if (Math.abs(houses[i] - heaters[j]) <= minDis) {
                    minDis = Math.abs(houses[i] - heaters[j]);
                    startIndex = j;//代表这台加热器已经被设定好了
                } else {
                    break;
                }
            }
            ans = Math.max(ans, minDis);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] houses = new int[]{1, 2, 3, 4, 5, 6};
        int[] heaters = new int[]{1, 4};
        System.out.println(findRadius(houses, heaters));
    }
}
