class Solution {
    public int calPoints(String[] s) {
        List<Integer> l = new ArrayList<>();
        int res = 0;
        for(int i = 0; i < s.length; i++){
            String ch = s[i];
            if(ch.equals("D")&&!l.isEmpty()){
                l.add(l.get(l.size()-1)*2);
            } else if(ch.equals("+")&&l.size()>=2){
                l.add(l.get(l.size()-1)+l.get(l.size()-2));
            } else if(ch.equals("C")&&!l.isEmpty()){
                l.remove(l.size()-1);
            } else {
                l.add(Integer.parseInt(ch));
            }
        }
        for(int i = 0; i < l.size(); i++){
            res = res + l.get(i);
        }
        return res;
    }
}