import java.util.ArrayList;
import java.util.List;

/**
 * Created by sw on 2018-06-04.
 */
public class pascalTriangleII {

    static public List<Integer> solution(int rowIndex) {
        //        0 1 2 3
        //    (0) 1 0 0 0
        //    (1) 1 1 0 0
        //    (2) 1 2 1 0
        //    (3) 1 3 3 1
        rowIndex++; //实际行数
        List<Integer> ans = new ArrayList<>();

        int[] cal = new int[rowIndex];
        cal[0] = 1;
        for (int i = 1; i < rowIndex; i++) {
            for (int j = i; j > 0; j--) { //倒着开始，防止数丢失
                cal[j] = cal[j] + cal[j - 1];
            }
        }

        for (int i = 0; i < rowIndex; i++) {
            ans.add(cal[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> ans = solution(rowIndex);
        for (int i = 0; i < rowIndex + 1; i++) {
            System.out.println(ans.get(i));
        }
    }
}
