class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            while (!st.isEmpty() && nums[i] > nums[st.peek()]) {
                int idx = st.pop();
                res[idx] = i - idx;
            }
            st.push(i);
        }
        return res;
    }
}