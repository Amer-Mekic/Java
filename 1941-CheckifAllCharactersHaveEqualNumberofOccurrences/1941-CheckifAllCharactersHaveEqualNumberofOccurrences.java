class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char c : ch){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Object[] vals = map.values().toArray();
        for(int i = 0; i<vals.length-1; i++){
            System.out.println(vals[i]);
            if(!vals[i].equals(vals[i+1]))
               return false;
        }
        return true;
    }
}