class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            char c = chars[i];
            int count = 1;
            while (i + 1 < n && chars[i + 1] == c) {
                i++;
                count++;
            }
            chars[index++] = c;
            if (count > 1) {
                for (char dig : Integer.toString(count).toCharArray()) {
                    chars[index++] = dig;
                }
            }
        }
        return index;
    }
}