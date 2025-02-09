class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            if(st.isEmpty()||asteroids[i]>0){
                st.add(asteroids[i]);
            } else {
                while(!st.isEmpty()){
                int top = st.peek();
                if(top<0){
                    st.push(asteroids[i]);
                    break;
                } 
                int mod = Math.abs(asteroids[i]);
                if(mod<top){
                    break;
                } else if(mod==top){
                    st.pop();
                    break;
                } else {
                    st.pop();
                    if(st.isEmpty()){
                        st.push(asteroids[i]);
                        break;
                    }
                }
                }
            }
            
        }
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}