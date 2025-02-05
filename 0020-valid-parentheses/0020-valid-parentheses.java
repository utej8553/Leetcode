import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Check for closing brackets and ensure the stack isn't empty
            if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else if (c == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else if (c == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else {
                // If it's an opening bracket, push onto the stack
                st.push(c);
            }
        }
        
        // Return true if the stack is empty, meaning all brackets were matched
        return st.isEmpty();
    }
}
