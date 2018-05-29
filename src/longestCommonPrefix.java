

public class longestCommonPrefix {
    static public String solution(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = "";
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                //如果开始位置不是0 或者 没有找到与prefix相同的子串，就不断的堆prefix串减一位字符。
                //如果prefix减为空字符串，那么说明没有最长公共前缀。
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] s = new String[]{"flower", "flow", "flight"};
        System.out.println(solution(s));
    }
}
