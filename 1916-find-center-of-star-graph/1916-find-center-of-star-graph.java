class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            map.put(a, map.getOrDefault(a, 0)+1);
            map.put(b, map.getOrDefault(b, 0)+1);
            if(map.get(a)==edges.length){
                return a;
            } else if(map.get(b)==edges.length){
                return b;
            }
        }
        return -1;
    }
}