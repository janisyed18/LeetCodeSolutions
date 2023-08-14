class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthOfAll = 0;
        for(int[] customers : accounts){
            int maxWealth = 0;
            for(int banks : customers){
                maxWealth += banks;
                maxWealthOfAll = Math.max(maxWealthOfAll, maxWealth);
            }
        }
        return maxWealthOfAll;
    }
}
