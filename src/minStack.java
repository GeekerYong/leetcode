import java.time.chrono.MinguoChronology;
import java.util.Stack;

/**
 * Created by sw on 2018-06-05.
 */
public class minStack {
    /**
     * initialize your data structure here.
     */
    static Stack<Integer> numStk;
    static Stack<Integer> minStk;

    public minStack() {
        numStk = new Stack<Integer>();
        minStk = new Stack<Integer>();
    }

    static public void push(int x) {
        if (numStk.empty()) {
            minStk.push(x);
        } else {
            if (minStk.peek() > x) {
                minStk.push(x);
            } else {
                minStk.push(minStk.peek());
            }
        }
        numStk.push(x);
    }

    static public void pop() {
        numStk.pop();
        minStk.pop();
    }

    static public int top() {
        return numStk.peek();
    }

    static public int getMin() {
        return minStk.peek();
    }

    public static void main(String[] args) {
        minStack obj = new minStack();
        obj.push(2);
        obj.push(3);
        obj.push(1);
        obj.push(4);
        int t1 = obj.top();
        int t2 = obj.getMin();
        obj.pop();
        obj.pop();
        int t3 = obj.getMin();
        System.out.println("");
    }
}
