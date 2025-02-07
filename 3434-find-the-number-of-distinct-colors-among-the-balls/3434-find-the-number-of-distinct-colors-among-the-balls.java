class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int[] res = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            if(map.containsKey(ball)) {
                int temp = map.get(ball);
                map2.put(temp, map2.get(temp)-1);
                if(map2.get(temp)==0) {
                    map2.remove(temp);
                }

            }
            map.put(ball, color);
            if (map2.containsKey(color)) {
                map2.put(color, map2.get(color) + 1);
            } else {
                map2.put(color, 1);
            }
            res[i] = map2.size();
        }
        
        return res;
    }
}