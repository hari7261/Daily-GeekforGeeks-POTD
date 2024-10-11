class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        int n = arr.size(); // Size of the input list
        // Create a result list initialized with -1
        List<Integer> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(-1); // Fill with -1 initially
        }
        
        // Populate the result list
        for (int i = 0; i < n; i++) {
            int value = arr.get(i);
            // Only place value if it is within the range and not -1
            if (value != -1 && value < n) {
                result.set(value, value); // Place value at its corresponding index
            }
        }
        
        return result; // Return the rearranged list
    }
}
