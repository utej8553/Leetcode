class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==')'&&!st.isEmpty()&&st.peek()=='('){
                st.pop();
            } else if(s.charAt(i)=='}'&&!st.isEmpty()&&st.peek()=='{'){
                st.pop();
            } else if(s.charAt(i)==']'&&!st.isEmpty()&&st.peek()=='['){
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        return st.isEmpty();
    }
}