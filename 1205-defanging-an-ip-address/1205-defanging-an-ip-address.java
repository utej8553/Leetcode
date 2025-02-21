class Solution {
    public String defangIPaddr(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()&&ch=='.'){
                st.push('[');
                st.push('.');
                st.push(']');
            } else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}