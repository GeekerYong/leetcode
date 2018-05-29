/**
 * Created by sw on 2018-05-29.
 */
public class lengthOfLastWord {
    static public int solution(String s) {
        String[] sArr =  s.split(" ");
        if (sArr.length ==0){
            return 0;
        }
        return sArr[sArr.length-1].length();

    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(solution(s));
    }
}
