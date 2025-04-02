class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean lower = false,upper = false,digit = false,special = false;
        int n = password.length();
        if(n<8) return false;
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(Character.isLowerCase(ch)) {
                lower = true;
            }
            else if(Character.isUpperCase(ch)){
                upper = true;
            }
            else if(Character.isDigit(ch)){
                digit = true;
            }
            else{
                special = true;
            }

        }
        if(lower && special && upper && digit && notSame(password)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean notSame(String password){
        for(int i=0;i<password.length()-1;i++){
            if(password.charAt(i)==password.charAt(i+1)){
                return false;
            }
            
        }
        return true;
    }
}