/**
 * Created by sw on 2018-06-26.
 */
public class convertANumberToHexadecimal {

    static public String toHex(int num) {
        //每四位处理一次，然后再右移4位(等同于除以16)直到全部处理完
        if (num == 0) return "0";
        char[] n2c = new char[]{
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        String ans = "";
        while (num != 0) {
            int index = (num & (15));
            ans = n2c[index] + ans;
            num = num >>> 4; // >>>无符号右移
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(toHex(-1));
    }
}
