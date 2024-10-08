class Solution {
    public static int pairsum(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return -1; 
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }

        return first + second;
    }
}
