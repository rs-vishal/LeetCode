class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        char[][] str = new char[numRows][n];
       int cur =0,row=0,col =0;

       while(cur < n ){
        while(row < numRows  && cur <n){
            str[row++][col] = s.charAt(cur++);
        }
        row = Math.max(0,row -2);
        while(row > 0 && cur < n){
            str[row--][++col] =  s.charAt(cur++);
        }
        col++;
       }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[0].length; j++) {
                if (str[i][j] != 0) { 
                    ans.append(str[i][j]);
                }
            }
        }
        return ans.toString();
    }
}