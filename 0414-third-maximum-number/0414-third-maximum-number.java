class Solution {
    public int thirdMax(int[] nums) {
        TreeSet <Integer> result = new TreeSet(Collections.reverseOrder());
        for(int num : nums){
            result.add(num);
            if(result.size()>3){
                result.pollLast();
            }
        }
        return result.size()==3 ? result.last() : result.first(); 
    }
}