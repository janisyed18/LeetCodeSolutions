class RunningSum {
    public int[] runningSum(int[] nums) {
      int[] res = new int[nums.length];
      //Setting up the result array index[0] value to provided nums array index[0] as there won't be any change in those values
      res[0] = nums[0];
      for(int i =1; i<nums.length; i++){
          res[i] = nums[i] + res[i-1]; 
      }  
      return res;
    }
}
