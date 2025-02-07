class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int[] res = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            if(map.containsKey(queries[i][0])) {
                int temp = map.get(queries[i][0]);
                map2.put(temp, map2.get(temp)-1);
                if(map2.get(temp)==0) {
                    map2.remove(temp);
                }

            }
            map.put(queries[i][0], queries[i][1]);
            map2.put(queries[i][1], map2.get(queries[i][1]) + 1);
            res[i] = map2.size();
        }
        
        return res;
    }
}