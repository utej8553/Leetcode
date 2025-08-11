class Solution {
    public void rotate(int[][] matrix) {
        int[][] matrix2 = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix2[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length/2; j++) {
                int temp = matrix2[i][j];
                matrix2[i][j] = matrix2[i][matrix[i].length - 1 - j];
                matrix2[i][matrix[i].length - 1 - j] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = matrix2[i][j];
            }
        }
    }
}