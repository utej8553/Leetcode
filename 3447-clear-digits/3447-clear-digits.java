class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                st.add(ch);
            } else{
                st.pop();
            }
        }
        String res = "";
        for(int i = 0; i<st.size(); i++){
            res = res + st.get(i);
        }
        return res;
    }
}