import java.util.Arrays;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat[0].length;
        int n = mat.length;
        int ar[] = new int[n];
        int original[] = new int[n];

        for(int i = 0; i < n; i++){
            int x = 0;
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 1){
                    x++;
                }
            }
            ar[i] = x;         
            original[i] = x;  
        }

        Arrays.sort(ar); 

        int res[] = new int[k];
        boolean[] used = new boolean[n];

        for(int i = 0; i < k; i++){
            for(int j = 0; j < n; j++){
                if(original[j] == ar[i] && !used[j]){
                    res[i] = j;
                    used[j] = true;
                    break;
                }
            }
        }

        return res;
    }
}
