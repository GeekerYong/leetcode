import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) {
            return ans;
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            subList.add(1);//开始1
            for (int j = 1; j < i; j++) {//排除第一行第二行，从第三行开始
                List<Integer> prevRow = ans.get(i - 1);
                subList.add(prevRow.get(j) + prevRow.get(j - 1));
            }
            if (i != 0) {
                subList.add(1);//除去第一行外，加入末尾1
            }
            ans.add(subList);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
