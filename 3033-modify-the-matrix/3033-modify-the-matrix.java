class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
         int[] max = new int[matrix[0].length];
        
        for(int i=0;i< matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                max[j] = Math.max(matrix[i][j],max[j]);
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = max[j];
                }
            }
        }
        
        
        return  matrix;
    }
}