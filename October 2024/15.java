class Solution:
    def subArraySum(self, arr, tar):
        prefix_sum_map = {0: 1}
        current_sum = 0
        count = 0
        for num in arr:
            current_sum += num
            if (current_sum - tar) in prefix_sum_map:
                count += prefix_sum_map[current_sum - tar]
            if current_sum in prefix_sum_map:
                prefix_sum_map[current_sum] += 1
            else:
                prefix_sum_map[current_sum] = 1
        
        return count
