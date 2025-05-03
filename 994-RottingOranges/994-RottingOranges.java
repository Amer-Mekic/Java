// Last updated: 03. 05. 2025. 20:42:12
class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int[] digs = new int[digits.length()];
        Queue<String> q = new LinkedList<>();
        for(int i = 0; i < digits.length(); i++)
            digs[i]=digits.charAt(i)-'0';

        q.add("");
        for(int i = 0; i < digits.length(); i++){
            System.out.println(q);
            String letter = letters[digs[i]-2];
            int size = q.size();
            for(int j = 0; j < size; j++){
                String curr = q.poll();
                for(char ch : letter.toCharArray()){
                    q.add(curr+ch);
                }
            }
        }
        System.out.println(q);
        return new ArrayList<>(q);
    }
}