class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sum(n);
        }
        
        return n == 1;
    }

    public int sum(int n) {
        int sum = 0;
        while (n != 0) {
            int s = n % 10;
            sum += (s * s);
            n = n / 10;
        }
        return sum;
    }
}