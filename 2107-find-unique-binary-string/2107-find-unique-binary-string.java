class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder res = new StringBuilder();
        Func(Arrays.asList(nums),0, new StringBuilder(), res);
        return res.toString();
    }
    public boolean Func(List<String> l, int index, StringBuilder s, StringBuilder res){
        if(index==l.size()){
            if(!l.contains(s.toString())){
                res.append(s);
                return true;
            }
            return false;
        }
        for(int i = 0; i <= 1; i++){
            s.append(i);
            if(Func(l, index+1, s, res)){
                return true;
            }
            s.deleteCharAt(s.length()-1);
        }
        return false;
    }
}