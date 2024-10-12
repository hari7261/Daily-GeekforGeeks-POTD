class Solution {
    public int pairWithMaxSum(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;
        int maxSum = arr[0] + arr[1];
        for (int i = 1; i < n - 1; i++) {
            maxSum = Math.max(maxSum, arr[i] + arr[i + 1]);
        }

        return maxSum;
    }
}
