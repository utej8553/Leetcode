class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if(ch==']'&&!st.isEmpty()&&st.peek()=='['){
                st.pop();
            } else {
                st.push(ch);
            }
        }
        
        int size = st.size()/2;
        System.out.println(st);
        if(size%2==0){
            return size/2;
        } else {
            return (size+1)/2;
        }
    }
}