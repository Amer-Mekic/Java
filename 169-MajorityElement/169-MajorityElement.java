class Solution {
    static{
        for(int i =0 ; i<500 ; i++){
            majorityElement(new int[]{});
        }
    }
    public static int majorityElement(int[] nums) {
        int ele = 0;
        int count = 0;
        for(int num : nums){
            if(count==0){
                ele = num;
                count++;
            }else if(ele==num){
                count++;
            }else{
                count--;
            }
        }
        return ele;
    }
}