class Solution {
    public int minimumLength(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int res = 0;
        for (char key : map.keySet()) {
            int count = map.get(key);
            if(count%2==0){
                res = res + 2;
            } else {
                res = res + 1;
            }
        }
        return res;
    }
}