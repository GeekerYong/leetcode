import java.util.HashMap;

public class isomorphicStrings {
    static public boolean solution(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        HashMap<Character, Integer> relationST = new HashMap<>();
        HashMap<Character, Integer> relationTS = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
            if (relationST.containsKey(sArr[i]) || relationTS.containsKey(tArr[i])) {
                if (relationST.get(sArr[i]) != relationTS.get(tArr[i])) {
                    return false;
                }
            } else {
                relationST.put(sArr[i], i);
                relationTS.put(tArr[i], i);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ab";
        String t = "ba";
        System.out.println(solution(s, t));
    }
}
