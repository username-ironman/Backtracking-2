import java.util.*;

class Solution {
    // Loop Recursion solution
    // Time complexity is O(n*2^n) please let me know if this time complexity is correct
    // Space complexity is O(h*2^n) please let me know if this space complexity is correct, h is the height of the tree
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
        result.add(path);
        for(int i = index; i<nums.length;i++){
            List<Integer> temp = new ArrayList<>(path);
            temp.add(nums[i]);
            helper(nums, i+1, temp);
        }
    }
}