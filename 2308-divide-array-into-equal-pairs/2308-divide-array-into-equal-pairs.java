class Solution {
    public boolean divideArray(int[] nums) {
        HashMap <Integer,Integer> arr = new HashMap<>();
        for(int num :nums){
            arr.put(num, arr.getOrDefault(num, 0) + 1);
        }
        for (int count : arr.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }        
        return true;        
    }
}