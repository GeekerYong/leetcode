import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    static public int firstUniqChar(String s) {
        char[] sArr = s.toCharArray();
        HashMap<Character, Integer> CalSet = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
            if (CalSet.containsKey(sArr[i])) {
                int num = CalSet.get(sArr[i]) + 1;
                CalSet.put(sArr[i], num);
            } else {
                CalSet.put(sArr[i], 1);
            }
        }

        char[] orign = s.toCharArray();
        for (int i = 0; i < orign.length; i++) {
            if (CalSet.get(orign[i]) == 1) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
