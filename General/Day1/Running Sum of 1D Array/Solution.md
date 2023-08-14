# Solution Explanation for Running Sum of 1d Array

This solution aims to calculate the running sum of an input array `nums`, where the running sum at index `i` is the sum of all elements from index 0 to `i`.

```java
class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i] + res[i - 1]; 
        }
        return res;
    }
}
```

## How the Solution Works

1. We start by creating a new integer array `res` with the same length as the input array `nums`. This `res` array will store the running sum values.

2. We initialize the first element of the `res` array with the first element of the `nums` array because the running sum at index 0 is simply the value of the first element.

3. We then iterate through the `nums` array starting from index 1, because we've already handled the first element:
   - For each index `i`, we calculate the running sum by adding the current element of `nums` to the previous running sum, which is stored in `res[i - 1]`.
   - We store this calculated running sum in the corresponding index `i` of the `res` array.

4. After completing the loop, the `res` array will contain the running sum values for each index, and we return it as the result.

## Time Complexity Analysis

The time complexity of this solution is O(n), where `n` is the length of the input array `nums`. This is because we iterate through the entire input array once in the `for` loop, performing a constant-time operation (addition) in each iteration.

## Space Complexity Analysis

The space complexity of this solution is O(n), where `n` is the length of the input array `nums`. This is because we use an additional array `res` of the same length as `nums` to store the running sum values. The space used by the `res` array grows linearly with the input size.

By following this approach, we effectively calculate the running sum while maintaining a clear understanding of the chosen algorithm's time and space complexities. This solution is efficient and provides a straightforward way to compute the running sum for an array of numbers.
