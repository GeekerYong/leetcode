import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KeyboardRow {
    static public String[] solution(String[] words) {
        //核心思想：判断单词所有的字母是否在同一行
        HashMap<Character, Integer> map = new HashMap<>();
        String[] s = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for (int i = 0; i < s.length; i++) {
            char a[] = s[i].toCharArray();
            for (int j = 0; j < a.length; j++) {
                map.put(a[j], i);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String str = words[i].toLowerCase();
            char a[] = str.toCharArray();
            int x = map.get(a[0]);
            boolean flag = true;
            for (int j = 1; j < a.length; j++) {
                if (map.get(a[j]) != x) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                list.add(words[i]);
        }
        words = new String[list.size()];
        int i = 0;
        for (String ss : list) {
            words[i] = ss;
            i++;
        }
        return words;

    }

    public static void main(String[] args) {

    }
}
