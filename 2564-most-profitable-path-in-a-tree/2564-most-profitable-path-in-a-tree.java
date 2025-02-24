import java.util.*;

class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = amount.length;
        List<Integer>[] tree = new ArrayList[n];
        for (int i = 0; i < n; i++) tree[i] = new ArrayList<>();
        for (int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
            tree[edge[1]].add(edge[0]);
        }

        int[] bobTime = new int[n];
        Arrays.fill(bobTime, Integer.MAX_VALUE);
        findBobPath(bob, -1, 0, bobTime, tree);

        return dfs(0, -1, 0, 0, bobTime, tree, amount);
    }

    private boolean findBobPath(int node, int parent, int time, int[] bobTime, List<Integer>[] tree) {
        if (node == 0) {
            bobTime[node] = time;
            return true;
        }
        for (int child : tree[node]) {
            if (child == parent) continue;
            if (findBobPath(child, node, time + 1, bobTime, tree)) {
                bobTime[node] = time;
                return true;
            }
        }
        return false;
    }

    private int dfs(int node, int parent, int time, int income, int[] bobTime, List<Integer>[] tree, int[] amount) {
        if (time < bobTime[node]) income += amount[node];
        else if (time == bobTime[node]) income += amount[node] / 2;

        if (tree[node].size() == 1 && node != 0) return income;

        int maxIncome = Integer.MIN_VALUE;
        for (int child : tree[node]) {
            if (child == parent) continue;
            maxIncome = Math.max(maxIncome, dfs(child, node, time + 1, income, bobTime, tree, amount));
        }
        return maxIncome;
    }
}
