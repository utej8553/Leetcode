class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int a = 0;
        for(int i = 0; i < s.length(); i++){
            if(a<spaces.length&&spaces[a]==i){
                a++;
                sb.append(' ');
            }
            sb.append(s.charAt(i));
        }
        return String.valueOf(sb);
    }
}