class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length ==0 || matrix[0].length ==0) return 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] mat = new int [n][m];
        int max =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    if(i== 0|| j==0){
                        mat[i][j] = 1;                        
                    }
                    else{
                        mat[i][j] = Math.min(Math.min(mat[i-1][j],mat[i][j-1]),mat[i-1][j-1])+1;
                    }
                    max = Math.max(max,mat[i][j]);
                }
            }
        }
        return max*max;
     }
}