class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet <Integer> uni = new HashSet<>();
        for(int num :nums){
            uni.add(num);
        }
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i=1;i<=n;i++){
            if(!uni.contains(i)){
                result.add(i);
            }
        }    
        return result;
    }
}