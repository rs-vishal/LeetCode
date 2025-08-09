class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if(digits == null || digits.length()==0) return res;

        Map<Character,String> a = new HashMap<>();
        a.put('2',"abc");
        a.put('3',"def");
        a.put('4',"ghi");
        a.put('5',"jkl");
        a.put('6',"mno");
        a.put('7',"pqrs");
        a.put('8',"tuv");
        a.put('9',"wxzy");
        
        bk(digits,0,new StringBuilder(), res,a);
        return res;
    }
    public void bk(String digits,int index,StringBuilder comb,List<String> res , Map<Character,String> a){
        if(index == digits.length()){
            res.add(comb.toString());
            return;
        }
        String lets = a.get(digits.charAt(index));
        for(char let:lets.toCharArray()){
            comb.append(let);
            bk(digits,index+1,comb,res,a);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}