class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> s = new Stack<>();
        int ans = 0;
        for(int i = 0; i < t.length; i++){
            if(t[i].equals("+")){
                int num1 = s.pop();
                int num2 = s.pop();
                s.push(num1+num2);
            } else if(t[i].equals("-")){
                int num1 = s.pop();
                int num2 = s.pop();
                s.push(num2-num1);
            } else if(t[i].equals("*")){
                int num1 = s.pop();
                int num2 = s.pop();
                s.push(num1*num2);
            } else if(t[i].equals("/")){
                int num1 = s.pop();
                int num2 = s.pop();
                s.push(num2/num1);
            } else {
                s.push(Integer.parseInt(t[i]));
            }
        }
        return s.pop();
    }
}