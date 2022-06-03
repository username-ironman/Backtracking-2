import java.util.*;

class Solution {
    // Without any recursion solution
    // Time complexity is O(2^n)
    // Space complexity is O(1)
    // This solution is submitted with zero errors
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for(int i = 0; i<nums.length;i++){
            int size = result.size();
            for(int j = 0; j<size; j++){
                List<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(nums[i]);
                result.add(temp);
            }
        }
        return result;
    }
}