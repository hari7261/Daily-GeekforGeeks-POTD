class Solution {
    public long findSmallest(int[] arr) {
        long res = 1;
        for (int i = 0; i < arr.length && arr[i] <= res; i++) {
            res += arr[i];
        }
        return res;
    }
}
