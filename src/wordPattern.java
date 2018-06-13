import java.util.HashMap;
import java.util.Map;

/**
 * Created by sw on 2018-06-13.
 */
public class wordPattern {
    static public boolean wordPattern(String pattern, String str) {
        Map<Character, String> rela1 = new HashMap<>();
        Map<String, Character> rela2 = new HashMap<>();
        String[] strArr = str.split(" ");
        char[] strPat = pattern.toCharArray();
        if (strArr.length != pattern.length()) {
            return false;
        } // 长度不同，必定不是相同模式

        for (int i = 0; i < strPat.length; i++) {
            if (rela1.containsKey(strPat[i]) || rela2.containsKey(strPat[i])) {
                if (rela1.containsKey(strPat[i])) {
                    if (rela1.get(strPat[i]) != strArr[i]) return false;
                } else {
                    if (rela2.get(strArr[i]) != strPat[i]) return false;
                }
            } else {
                rela1.put(strPat[i], strArr[i]);
                rela2.put(strArr[i], strPat[i]);
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));
    }
}
