import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by sw on 2018-06-29.
 */
public class repeatedSubstringPattern {
    static public boolean solution(String s) {
        if (s.length() == 1) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        //遍历统计
        for (Character Char : s.toCharArray()
                ) {
            map.put(Char, map.getOrDefault(Char, 0) + 1);
        }
        //遍历判断1
        boolean flag1 = true;
        for (Character Char : map.keySet()
                ) {
            if (map.get(Char) % 2 != 0) {
                flag1 = false;
                break;
            }
        }
        //遍历判断2
        boolean flag2 = true;
        int forward = map.get(s.toCharArray()[0]);
        for (Character Char : map.keySet()
                ) {
            int current = map.get(Char);
            if (forward != current) {
                flag2 = false;
                break;
            }
        }
        if (flag1 || flag2) {
            return true;
        } else {
            return false;
        }
    }

    static public boolean solution2(String s) {
        //遍历所有可能的子串
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i != 0) continue;
            String template = s.substring(0, i);
            boolean flag = true;
            for (int j = i; j < s.length(); j = j + i) {
                String comp = s.substring(j, j + i);
                if (!template.equals(comp)) {
                    flag = false;
                    break;
                }
            }
            if (flag) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution2("abab"));
    }
}
