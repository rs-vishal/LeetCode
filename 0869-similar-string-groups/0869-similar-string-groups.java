class Solution {
    private static boolean areSimilar(String s1, String s2) {
        int count = 0;
        if (s1.equals(s2)) return true;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) return false;
            }
        }
        return count == 2;
    }
     public static int numSimilarGroups(String[] strs) {
        int n = strs.length;
        boolean[] visited = new boolean[n];
        int groupCount = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                groupCount++;
                findGroup(strs, visited, i);
            }
        }
        
        return groupCount;
    }

    private static void findGroup(String[] strs, boolean[] visited, int index) {
        visited[index] = true;

        for (int i = 0; i < strs.length; i++) {
            if (!visited[i] && areSimilar(strs[index], strs[i])) {
                findGroup(strs, visited, i);
            }
        }
    }

}