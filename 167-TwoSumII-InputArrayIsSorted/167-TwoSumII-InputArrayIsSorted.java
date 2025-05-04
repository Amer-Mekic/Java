// Last updated: 04. 05. 2025. 17:02:16
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while(l<r){
            System.out.println("sum l + r: "+(numbers[r]+numbers[l]));
            System.out.println("Left: "+numbers[l]);
            System.out.println("Right "+numbers[r]);
            if(numbers[r]+numbers[l] == target){
                return new int[]{l+1,r+1};
            }
            /*
            if(numbers[mid]-Math.abs(numbers[l]) == target){
                return new int[]{l+1,mid+1};
            }
            if(numbers[r]-Math.abs(numbers[mid]) == target){
                return new int[]{l+1,mid+1};
            }
            */
            else if(numbers[r]+numbers[l]<target){
                l++;
            }
            else{
                r--;
            }
        }
        // -4
        return new int[]{-1, -1};
    }
}