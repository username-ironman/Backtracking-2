import java.util.*;

class Solution {
    // Loop Recursion solution with backtracking
    // Time complexity is O(2^n) please let me know if this time complexity is correct
    // Space complexity is O(h) please let me know if this space complexity is correct
    // h is the height of the tree
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
        // Logic
        // We are adding at each node in loop based recursion thats why no base case is written
        // And not only at the end
        result.add(new ArrayList<>(path));
        for(int i = index; i<nums.length;i++){
            path.add(nums[i]);
            helper(nums, i+1, path);
            path.remove(path.size()-1);
        }
    }
}