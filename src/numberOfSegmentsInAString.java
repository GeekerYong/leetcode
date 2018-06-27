/**
 * Created by sw on 2018-06-27.
 */
public class numberOfSegmentsInAString {
    static public int solution(String s) {
        if (s.length() == 0) return 0;
        String[] ans = s.split(" ");
        int ansCnt = 0;
        for (int i = 0; i < ans.length; i++) {
            if (!ans[i].equals("")) {
                ansCnt++;
            }
        }
        return ansCnt;
    }

    public static void main(String[] args) {
        System.out.println(solution(", , , ,        a, eaefa"));
    }
}
