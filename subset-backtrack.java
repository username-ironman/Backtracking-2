import java.util.*;

class Solution {
    // Normal Recursion solution with backtrack
    // Time complexity is O(2^n) please let me know if this time complexity is correct
    // Space complexity is O(h) please let me know if this space complexity is correct
    // This solution is submitted on leetcode with zero errors
    private List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        //Edge case
        if(nums==null || nums.length == 0) return result;
        helper(nums,0, new ArrayList<>());
        return result;
    }
    
    private void helper(int[] nums, int index, List<Integer> path){
        // Edge case
        if(index == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        
        // Logic
        // Do not choose
        helper(nums, index+1, path);
        path.add(nums[index]);  
        // Choose case
        helper(nums, index+1, path);
        path.remove(path.size()-1);
        
    }
}