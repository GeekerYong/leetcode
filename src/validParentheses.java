import java.util.Stack;

/**
 * Created by sw on 2018-05-28.
 */
public class validParentheses {
    static public boolean isValid(String s){
        Stack<Character> st = new Stack<Character>();
        char[] sArr = s.toCharArray();
        if (sArr.length %2 != 0){
            return false;
        }
        for (int i = 0; i < sArr.length; i++) {
            if (st.empty()==true){
                st.push(sArr[i]);
                continue;
            }
            if (sArr[i] == '(' || sArr[i] == '{' || sArr[i] == '['){
                st.push(sArr[i]);
            }else if ((st.peek() == '('&&sArr[i] == ')') || (st.peek() == '['&&sArr[i] == ']') || (st.peek() == '{'&&sArr[i] == '}')){
                st.pop(); //匹配的上
            }else{
                return false;//匹配不上
            }
        }
        if (st.empty()==true){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "((";
        System.out.println(isValid(s));
    }
}
