# 1480. Running Sum of 1d Array

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen)

## Problem Description

Given an array `nums`, we want to calculate the running sum of the array. The running sum of an array at index `i` is defined as the sum of elements from index 0 to `i`, inclusive.

Implement a function `runningSum(nums)` that returns the running sum of `nums`.

### Example

#### Example 1:

Input: `nums = [1,2,3,4]`
Output: `[1,3,6,10]`
Explanation: Running sum is obtained as follows: `[1, 1+2, 1+2+3, 1+2+3+4]`.

#### Example 2:

Input: `nums = [1,1,1,1,1]`
Output: `[1,2,3,4,5]`
Explanation: Running sum is obtained as follows: `[1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1]`.

#### Example 3:

Input: `nums = [3,1,2,10,1]`
Output: `[3,4,6,16,17]`

### Constraints:

- 1 <= nums.length <= 1000
- -10^6 <= nums[i] <= 10^6
