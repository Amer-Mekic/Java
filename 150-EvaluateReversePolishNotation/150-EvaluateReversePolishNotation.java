// Last updated: 27. 06. 2025. 16:20:00
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while(i<tokens.length){
            switch(tokens[i]){
                case "+":
                    int sum = 0;
                    int lst = s.pop();
                    int fst = s.pop();
                    sum = fst+lst;
                    s.push(sum);
                    break;
                case "-":
                    int sub = 0;
                    int lstt = s.pop();
                    int fstt = s.pop();
                    sub = fstt-lstt;
                    s.push(sub);
                    break;
                case "*":
                    int times = 0;
                    int ls = s.pop();
                    int fs = s.pop();
                    times = fs*ls;
                    s.push(times);
                    break;
                case "/":
                    int div = 0;
                    int l = s.pop();
                    int f = s.pop();
                    div = f/l;
                    s.push(div);
                    break;
                default:
                    s.push(Integer.parseInt(tokens[i]));
            }
            i++;
        }
        return s.pop();
    }
}