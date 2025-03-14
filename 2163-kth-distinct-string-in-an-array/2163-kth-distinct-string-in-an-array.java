class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> mp = new HashMap<>();
        for(String s: arr){
            if(mp.containsKey(s)){
                mp.put(s, mp.get(s)+1);
            }else {
                mp.put(s, 1);
            }
        }
        int count = 0;
        for(String s: arr){
            if(mp.get(s)==1){
                count++;
                if(count==k){
                    return s;
                }
            }
        }
        return "";
    }
}