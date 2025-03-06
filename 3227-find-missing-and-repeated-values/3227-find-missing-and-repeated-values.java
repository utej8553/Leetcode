class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int n = grid.length;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                int num = grid[i][j];
                if(set.contains(num)){
                    res[0] = num;
                }
                set.add(num);
            }
        }
        int sum = 0;
        int form = (n * n * (n * n + 1)) / 2;
        for(int num: set){
            sum = sum + num;
        }
        res[1] = form-sum;
        return res;
    }
}