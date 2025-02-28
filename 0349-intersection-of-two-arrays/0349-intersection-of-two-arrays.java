class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List <Integer> list=new ArrayList<>();
        HashSet <Integer>  s1= new HashSet<>();
        HashSet <Integer>  s2= new HashSet<>(); 
        for(int nums: nums1)
            s1.add(nums);
        for(int nums : nums2)
            s2.add(nums);

        Map <Integer,Integer> map=new HashMap<>();
        for(int nums : s1)
        {
            map.put(nums,0);
        }
        for(int nums :s2)
        {
            if(map.containsKey(nums))
            {
                list.add(nums);
            }

        }
        int [] arr=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;

    }
}