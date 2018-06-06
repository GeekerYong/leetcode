/**
 * Created by sw on 2018-06-06.
 */
public class reverseBits {
    static public int[] transBits(int n) {
        int[] ans = new int[32];
        int i = 0;
        while (n != 0) {
            ans[i] = n % 2;
            n = n / 2;
            i++;
        }
        return ans;
    }

    static public int transInt(int[] bits) {
        int ans = 0;
        for (int i = bits.length - 1; i >= 0; i--) {
            ans = ans * 2 + bits[i];
        }
        return ans;
    }

    static public void reverseBits(int[] bits) {
        int temp;
        int start = 0;
        int end = bits.length - 1;
        while (start < end) {
            temp = bits[start];
            bits[start] = bits[end];
            bits[end] = temp;
            start++;
            end--;
        }
    }

    //上述具有溢出情况
    //方案2:移位算法
    static public int reverseBits2(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            if ((n & 1) == 1) {
                ans++; //如果n的最低位为1,那么ans的最低位就变为1.
            }
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] bits = transBits(43261596);
//        for (int i = bits.length-1; i >= 0; i--) {
//            System.out.print(bits[i]);
//        }
//        reverseBits(bits);
//        System.out.println("");
//        for (int i = bits.length-1; i >= 0; i--) {
//            System.out.print(bits[i]);
//        }
//        System.out.println("");
//        System.out.println(transInt(bits));
        System.out.println(reverseBits2(43261596));
    }
}
