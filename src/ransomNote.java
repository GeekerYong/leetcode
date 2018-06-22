import java.util.HashMap;

public class ransomNote {
    static public boolean canConstruct(String ransomNote, String magazine) {
        char[] rnArr = ransomNote.toCharArray();
        char[] mgArr = magazine.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        // 先将magazine中的字符放入map中并进行统计
        for (int i = 0; i < mgArr.length; i++) {
            if (map.containsKey(mgArr[i])) {
                int num = map.get(mgArr[i]) + 1;
                map.put(mgArr[i], num);
            } else {
                map.put(mgArr[i], 1);
            }
        }
        //接着遍历ransomNote中的字符，遇见一个map中有的就把对应项减1
        //如果没有或者减到小于0则直接返回false
        //如果遍历完成则返回true
        for (int i = 0; i < rnArr.length; i++) {
            if (map.containsKey(rnArr[i])) {
                int num = map.get(rnArr[i]) - 1;
                if (num < 0) return false;
                map.put(rnArr[i], num);
            } else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "gdcff";
        String s2 = "hiagejhbfdfgbdbccgjfbefgbdfiajejfabefecjcjbgidcdfhbigecbiediadg";
        System.out.println(canConstruct(s1, s2));
    }
}
