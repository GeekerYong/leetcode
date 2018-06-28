/**
 * Created by sw on 2018-06-28.
 */
public class stringCompression {
    static public int solution(char[] chars) {
        if (chars.length == 0) return 0;
        int i = 0; //记录写入位置
        int j = 0; //记录每个字符快遍历的起始位置
        for (int k = 0; k < chars.length; k++) {
            if (k + 1 == chars.length || chars[k] != chars[k + 1]) {//到达字符数组末尾或者字符块末尾
                chars[i] = chars[j]; //记录下该字符
                i++;//进入下一位置准备记录数字
                if (j < k) { //保证仅有一个字符的字符块不会写入个数字符
                    for (char a : ("" + (k - j + 1)).toCharArray() // k-j+1 即为每个字符块的长度
                            ) {
                        chars[i++] = a;
                    }
                }
                j = k + 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        char[] test = new char[]{'a', 'a', 'b', 'b', 'b'};
        System.out.println(solution(test));
    }
}
