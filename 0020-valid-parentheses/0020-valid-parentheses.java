class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() == 1) return false;
        for(char ch :s.toCharArray()){
            if(ch == '[' || ch =='{' || ch == '('){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }
}