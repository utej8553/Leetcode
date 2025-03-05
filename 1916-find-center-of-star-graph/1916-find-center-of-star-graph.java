class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            } else {
                map.put(a, 1);
            }
            if(map.containsKey(b)){
                map.put(b, map.get(b)+1);
            } else {
                map.put(b, 1);
            }
            if(map.get(a)==edges.length){
                return a;
            } else if(map.get(b)==edges.length){
                return b;
            }
        }
        return -1;
    }
}