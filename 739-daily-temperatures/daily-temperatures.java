class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.empty() && temperatures[st.peek()] < temperatures[i]) {
                 int index = st.pop();
                mp.put(index, i - index);
            }
            st.push(i);
        }
        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            ans[i] = mp.getOrDefault(i, 0);
        }
        return ans;
    }
}