class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int result =0;
        Arrays.sort(people);
        int left =0 , right = people.length-1;
        while(left <=right){
            int sum = people[left] + people[right];
            if(sum <= limit){
                result++;
                left++;
                right--;
            }
            else{
                result++;
                right--;
            }
        }
        return result;
    }
}