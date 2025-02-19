class Solution {
    public String getHappyString(int n, int k) {
        List<String> l = new ArrayList<>();
        Func(n, 0, l, new StringBuilder(), "abc");
        if(k>l.size()){
            return "";
        } else{
            return l.get(k-1);
        }
    }
    public void Func(int size, int index, List<String> l, StringBuilder str, String s){
        if(index==size) {
            l.add(str.toString());
            return;
        }
        for(int i = 0; i < s.length(); i++){
            if(str.length()==0||str.charAt(str.length()-1)!=s.charAt(i)){
                str.append(s.charAt(i));
                Func(size, index+1, l, str, s);
                str.deleteCharAt(str.length() - 1);
            }
        }
        return;
    }
}