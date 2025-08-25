class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1) return -1;
        int n = grid.length;
        int path =0;
        int m = grid[0].length;

        int dir[][] ={{0,1},{1,0},{-1,-1},{0,-1},{-1,0},{1,1},{1,-1},{-1,1}}; 
        Queue<int []> q = new LinkedList<>();
        q.add(new int[] {0,0,1});
        grid[0][0] = 1;
        while(!q.isEmpty()){
            int s = q.size();
            while(s-- > 0){
                int [] point = q.poll();
                if(point[0] == m-1 && point[1] == n-1){
                    return point[2];
                }
                for(int []d : dir){
                    int r = point[0] + d[0];
                    int c = point[1] + d[1];

                    if(r >= 0 && c>=0 && r < m && c< n && grid[r][c]  == 0  ){
                        q.add(new int[] {r,c,point[2]+1});
                        grid[r][c] =1;
                    }
                }
            }
        }
        
        return -1;
    }
}