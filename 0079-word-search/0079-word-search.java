class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length, cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word, int i, int j, int pos){
        if (pos == word.length()) return true; 
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (board[i][j] != word.charAt(pos)) return false;
        char temp = board[i][j];
        board[i][j] = '#';
        boolean found = dfs(board, word, i + 1, j, pos + 1) ||
                        dfs(board, word, i - 1, j, pos + 1) ||
                        dfs(board, word, i, j + 1, pos + 1) ||
                        dfs(board, word, i, j - 1, pos + 1);
        board[i][j] = temp;

        return found;
    }
}