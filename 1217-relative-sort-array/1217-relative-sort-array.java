class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        

        Map<Integer,Integer> freq = new HashMap<>();
        for(int a : arr1){
            freq.put(a,freq.getOrDefault(a,0)+1);
        }
        List<Integer> a1 = new ArrayList<>();
        for(int i : arr2){
            int n  = freq.get(i);
            while(n>0){
                a1.add(i);
                n--;
            }
        }
        List<Integer> a2 = new ArrayList<>();
        boolean b = true;
        for(int i : arr1){
            b=true;
            for(int j : arr2){
                if(i==j){
                    b=false;
                    break;
                } 
            }
            if(b){
                a2.add(i);
            }
        }
        Collections.sort(a2);
        for(int i :a2) a1.add(i);
        int res [] = new int[arr1.length];
        int k=0;
        for(int a : a1){
            res[k] = a;
            k++;
        }
        return res;

        
    }
}