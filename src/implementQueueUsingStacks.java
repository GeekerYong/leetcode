import java.util.Stack;

/**
 * Created by sw on 2018-06-08.
 */
public class implementQueueUsingStacks {
    static public class MyQueue {

        Stack<Integer> s1;
        Stack<Integer> s2;

        public MyQueue() {
            s1 = new Stack<Integer>();
            s2 = new Stack<Integer>();
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            if (s2.empty()) {
                while (!s1.empty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        public int peek() {
            if (s2.empty()) {
                while (!s1.empty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        public boolean empty() {
            if (s1.empty() && s2.empty()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        obj.push(4);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
    }
}

