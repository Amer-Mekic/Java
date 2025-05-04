// Last updated: 04. 05. 2025. 17:03:29
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0, p2 = numbers.length - 1;
        while (p1 < p2) {
            int r = numbers[p1] + numbers[p2];
            if (r == target) {
                return new int[] {p1+1,p2+1};
            } else if (r > target) p2 = binarySearch(numbers,p1+1,p2-1,target-numbers[p1]);
            else p1 = binarySearch(numbers,p1+1,p2-1,target-numbers[p2]);
        }
        return null;
    } 

    public static int binarySearch(int[] arr, int low, int high, int t) {
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == t) return mid;
            else if (arr[mid] > t) high = mid - 1;
            else low = mid + 1;
        }
        return mid;
    }
}