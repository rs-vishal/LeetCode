class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num  : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            int key = m.getKey();
            int value = m.getValue();
            if(value > (n/3)) {
                result.add(key);
                // System.out.println("key ="+key+"value ="+value);
            }

        }
        return result;
    }
}