/**
 * Created by sw on 2018-05-28.
 */
public class implementStrStrFunc {
    static public int strStr(String haystack, String needle) {
        char[] sc1 = haystack.toCharArray();
        char[] sc2 = needle.toCharArray();
        if (sc2.length ==0){
            return 0;
        }
        if (sc1.length < sc2.length){
            return -1;
        }
        for (int i = 0; i < sc1.length; i++) {
            if (sc1[i] == sc2[0]){
                boolean flag = true;
                if ((sc1.length-i) < sc2.length ){
                    return -1;
                }
                for (int j = 0; j < sc2.length; j++) {
                    if (sc1[i+j] != sc2[j]){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    return i;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        String haystack ="a";
        String needle = "a";
        System.out.println(strStr(haystack, needle));
    }
}
