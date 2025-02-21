class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s = new HashSet<>();
        for(int candy : candyType){
            s.add(candy);
        }
        if(s.size()>(candyType.length/2))
            return candyType.length/2;
        return s.size();
    }
}