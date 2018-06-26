import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
    static public List<String> solution(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add("" + i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<String> ans = solution(15);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
