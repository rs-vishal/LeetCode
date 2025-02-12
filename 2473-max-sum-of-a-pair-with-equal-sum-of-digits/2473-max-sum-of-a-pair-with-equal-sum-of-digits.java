class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> digitSumMap = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int digitSum = sumOfDigits(num);

            if (digitSumMap.containsKey(digitSum)) {
                maxSum = Math.max(maxSum, num + digitSumMap.get(digitSum));
                digitSumMap.put(digitSum, Math.max(digitSumMap.get(digitSum), num));
            } else {
                digitSumMap.put(digitSum, num);
            }
        }

        return maxSum;
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
