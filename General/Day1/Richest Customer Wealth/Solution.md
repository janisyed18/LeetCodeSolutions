# Solution Explanation for Richest Customer Wealth

This solution aims to find the richest customer's wealth given a 2D array `accounts`, where each row represents a customer and each column represents the amount of money in a bank account.

```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthOfAll = 0;
        for (int[] customers : accounts) {
            int maxWealth = 0;
            for (int banks : customers) {
                maxWealth += banks;
                maxWealthOfAll = Math.max(maxWealthOfAll, maxWealth);
            }
        }
        return maxWealthOfAll;
    }
}
```

## How the Solution Works

1. We start by initializing `maxWealthOfAll` to store the maximum wealth found among all customers. It is initially set to 0.

2. We loop through each `customers` array in the `accounts` array:
   - For each `customers` array (which represents a customer), we initialize `maxWealth` to 0. This variable will keep track of the wealth for the current customer.

   - We then loop through each `banks` value in the `customers` array:
     - For each `banks` value (which represents the amount of money in a bank account), we add it to the `maxWealth` of the current customer.

     - We also update `maxWealthOfAll` by taking the maximum of the current `maxWealthOfAll` and the current `maxWealth`. This ensures that `maxWealthOfAll` holds the maximum wealth found so far among all customers.

3. After both loops finish, `maxWealthOfAll` will contain the wealth of the richest customer among all customers.

4. We return `maxWealthOfAll` as the result.

## Time Complexity Analysis

The time complexity of this solution is O(m * n), where `m` is the number of customers (rows in `accounts`) and `n` is the number of banks (columns in `accounts`). We iterate through all elements in the `accounts` array once, performing constant-time operations (addition and comparison) for each element.

## Space Complexity Analysis

The space complexity of this solution is O(1), as we only use a constant amount of additional space to store variables (`maxWealthOfAll`, `maxWealth`, `customers`, and `banks`) regardless of the input size.

By following this approach, we efficiently find the richest customer's wealth while understanding the algorithm's time and space complexities. This solution is straightforward and effective for solving the problem.
