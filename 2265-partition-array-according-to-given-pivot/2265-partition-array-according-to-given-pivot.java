class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> list=new ArrayList();
        int idx=0;
        int pivCnt=0;

        for(int i=0; i<n; i++){
            if(nums[i]==pivot){
                pivCnt++;
            }
            else if(nums[i]>pivot){
                list.add(nums[i]);                
            }
            else{
                nums[idx++]=nums[i];
            }
        }

        for(int i=0; i<pivCnt; i++){
            nums[idx++]=pivot;
        }

        for(int val:list){
            nums[idx++]=val;
        }
        
        return nums;
    }
}