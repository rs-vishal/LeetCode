class Solution {
    public int findLHS(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int num : nums){
        map.put(num,map.getOrDefault(num,0)+1);        
       }
       int result =0;
       for(int key : map.keySet()){
        if(map.containsKey(key+1)){
            result = Math.max(result,map.get(key+1)+map.get(key));
        }
       }
       return result;

    }
}