class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    	 Map<Integer, Integer> sumMap = new HashMap<>();

    	for (int i = 0; i < nums.length; i++) {
    		if(sumMap.containsKey(nums[i])) {
    			return new int[]{sumMap.get(nums[i]), i};
    		}
    		sumMap.put(target - nums[i], i);
    	}
    	return new int[0];
    }
}