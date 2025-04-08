// Last updated: 08. 04. 2025. 17:29:11
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        ArrayList<Boolean> arr=new ArrayList<>();
        int max=0;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                arr.add(true);
            }else{
                arr.add(false);
            }

        }

        return arr;
    }
}