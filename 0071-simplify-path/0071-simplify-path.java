class Solution {
    public String simplifyPath(String path) {
        String [] components = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String cmp  : components){
            if(cmp.equals("")||cmp.equals(".")){
                continue;
            }
            if(cmp.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else{
                stack.push(cmp);
            }
        }
        StringBuilder sb  = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,"/"+stack.pop());
        }
        return sb.length() == 0 ? "/" : sb.toString();        
    }
}