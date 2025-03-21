class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> num = new HashMap<>();
        for(int a : arr){
            num.put(a, num.getOrDefault(a, 0) + 1);
        }
        List<Integer> freqList = new ArrayList<>(num.values());
        Collections.sort(freqList);
         int uniqueCount = freqList.size();
        for (int freq : freqList) {
            if (k >= freq) {
                k -= freq;
                uniqueCount--;
            } else {
                break; 
            }
        }
        return uniqueCount;
    }
}