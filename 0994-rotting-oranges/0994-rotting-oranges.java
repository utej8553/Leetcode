class Solution {
    public int orangesRotting(int[][] grid) {
        int res = 0;
        while (func(grid)) {
            List<List<Integer>> list = func2(grid);
            boolean changed = func3(list, grid);
            if (!changed) return -1;
            res++;
        }
        return res;
    }
    public boolean func(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<List<Integer>> func2(int[][] grid) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    list.add(Arrays.asList(i, j));
                }
            }
        }
        return list;
    }
    public boolean func3(List<List<Integer>> list, int[][] grid) {
        boolean changed = false;
        for (List<Integer> pos : list) {
            int i = pos.get(0);
            int j = pos.get(1);
            if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                grid[i][j - 1] = 2;
                changed = true;
            }
            if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                grid[i][j + 1] = 2;
                changed = true;
            }
            if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                grid[i - 1][j] = 2;
                changed = true;
            }
            if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                grid[i + 1][j] = 2;
                changed = true;
            }
        }
        return changed;
    }
}