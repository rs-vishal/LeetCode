class Solution {
    public int numTriplets(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        HashMap<Long,Integer> hp1 = new HashMap<>();
        HashMap<Long,Integer> hp2 = new HashMap<>();

        for(int i=0; i<n1; i++){
            long a = (long)arr1[i]*(long)arr1[i];
            if(hp1.containsKey(a)) hp1.put(a,hp1.get(a)+1);
            else hp1.put(a,1);
        }

        for(int i=0; i<n2; i++){
            long a = (long)arr2[i]*(long)arr2[i];
            if(hp2.containsKey(a)) hp2.put(a,hp2.get(a)+1);
            else hp2.put(a,1);
        }


        int ans = 0;

        for(int i=0; i<n1; i++){
            for(int j=i+1; j<n1; j++){
                long a = (long)arr1[i]*(long)arr1[j];
                if(hp2.containsKey(a)){
                    ans=ans+hp2.get(a);
                }
            }
        }

        for(int i=0; i<n2; i++){
            for(int j=i+1; j<n2; j++){
                long a = (long)arr2[i]*(long)arr2[j];
                if(hp1.containsKey(a)){
                    ans=ans+hp1.get(a);
                }
            }
        }

        return ans;
    }
}