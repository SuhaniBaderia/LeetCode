import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!st.empty() &&
                   temperatures[st.peek()] < temperatures[i]) {

                int index = st.pop();

                ans[index] = i - index;
            }

            st.push(i);
        }

        return ans;
    }
}