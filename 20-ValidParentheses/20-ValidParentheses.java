class Solution {
    public boolean isValid(String s) {
        boolean is = false;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
            if(stack.isEmpty())
                return false;
            char top = stack.peek();
            if(top==c-1){
                is=true;
                stack.pop();
            }
            else if(top=='{' && c=='}'){
                is=true;
                stack.pop();
            }
            else if(top=='[' && c==']'){
                is=true;
                stack.pop();
            }
            else
                return false;
            }
        }
        if(stack.isEmpty())
            return is;
        return false;
    }
}