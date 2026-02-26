class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        int temp;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j]==1){
                    temp = func(grid, i, j);
                    if(temp>res){
                        res = temp;
                    }
                }
            }
        }
        return res;
    }
    public int func(int[][] grid, int i, int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        int area = 1;
        grid[i][j]=0;
        area = area + func(grid, i+1, j);
        area = area + func(grid, i, j+1);
        area = area + func(grid, i-1, j);
        area = area + func(grid, i, j-1);
        return area;
    }
}