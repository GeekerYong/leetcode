/**
 * Created by sw on 2018-06-26.
 */
public class longestPalindrome {
    static public int solution(String s) {

        int odds = 0;//统计奇数的数目
        int[] lowerCount = new int[26];
        int[] upperCount = new int[26];

        char[] sArr = s.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] < 'a') {
                upperCount[sArr[i] - 'A']++;
            } else {
                lowerCount[sArr[i] - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (upperCount[i] % 2 != 0) odds++;
            if (lowerCount[i] % 2 != 0) odds++;
        }
        if (odds == 0) {
            return sArr.length;
        } else {
            return sArr.length - odds + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("abccccdd"));
    }
}
