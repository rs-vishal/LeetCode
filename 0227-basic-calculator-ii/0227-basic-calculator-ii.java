class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        if(s==null || s.length()==0) return 0;
        int curr =0;
        char op = '+';
        char [] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])){
                curr = curr * 10 +arr[i] -'0';
            }
            if(!Character.isDigit(arr[i]) && arr[i] != ' ' || i == arr.length -1 ){
                if(op == '+'){
                    stack.push(curr);
                }else if(op == '-'){    
                    stack.push(-curr);

                }else if(op == '*'){
                    stack.push(stack.pop() * curr);
                }
                else if(op == '/'){
                    stack.push(stack.pop() / curr);

                }
                op = arr[i];
                curr=0;
            }
        }
        int sum =0 ;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;

    }
}