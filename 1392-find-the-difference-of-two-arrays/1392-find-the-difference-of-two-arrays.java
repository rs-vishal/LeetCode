class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) { 
        Set<Integer> arr1 = new HashSet<>();
        Set<Integer> arr2 = new HashSet<>();
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> diffarr1 = new ArrayList<>();
        List<Integer> diffarr2 = new ArrayList<>();

        for (int num : nums1) {
            arr1.add(num);
        }

        for (int num : nums2) {
            arr2.add(num);
        }

        for (int num : arr1) {
            if (!arr2.contains(num)) {
                diffarr1.add(num);
            }
        }

        for (int num : arr2) {
            if (!arr1.contains(num)) {
                diffarr2.add(num);
            }
        }

        result.add(diffarr1);
        result.add(diffarr2);

        return result;       
    }
}