import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sw on 2018-06-07.
 */
public class implementStackUsingQueues {
    static public class Mystack {
        Queue<Integer> Q1;
        Queue<Integer> Q2;

        Mystack() {
            Q1 = new LinkedList<Integer>();
            Q2 = new LinkedList<Integer>();
        }

        public void push(int x) {
            Q1.add(x);
        }

        public int pop() {
            while (Q1.size() != 1) {
                Q2.add(Q1.poll());
            }
            int ans = Q1.poll();
            while (!Q2.isEmpty()) {
                Q1.add(Q2.poll());
            }
            return ans;
        }

        public int top() {
            while (Q1.size() != 1) {
                Q2.add(Q1.poll());
            }
            int ans = Q1.peek();
            Q2.add(Q1.poll());
            while (!Q2.isEmpty()) {
                Q1.add(Q2.poll());
            }
            return ans;
        }

        public boolean empty() {
            return Q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        Mystack obj = new Mystack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.empty());

    }
}
