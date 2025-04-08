// Last updated: 08. 04. 2025. 17:28:33
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<candies.length;i++){
            if(candies[i]>max)
                max = candies[i];
            if(candies[i]<min)
                min = candies[i];
        }
        int maxOld = max;
        for(int i = 0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=maxOld){
                max = candies[i]+extraCandies;
                list.add(true);
            }
            else
                list.add(false);
        }
        return list;
    }
}