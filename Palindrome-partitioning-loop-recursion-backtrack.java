import java.util.*;

class Solution {
    // Loop based recursion solution with backtracking
    // Time complexity is (2^n/2) since we are only choosing here
    // Space complexity is O(h)
    // This solution is submitted on leetcode with zero errors
    private List<List<String>> result;
    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        //Edge case
        if(s==null || s.length() ==0) return result;
        helper(s,0,new ArrayList<>());
        return result;
    }
    
    private void helper(String s, int idx, List<String> path){
        //Base case
        if(idx==s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        //Logic
        for(int i = idx; i<s.length();i++){
            String sub = s.substring(idx,i+1);
            if(isPalindrome(sub)){
                //action
                path.add(sub);
                //recurse
                helper(s, i+1, path);
                //backtrack
                path.remove(path.size()-1);
            }
        }
    }
    
    private boolean isPalindrome(String sub){
        int start = 0;
        int end = sub.length()-1;
        while(start<end){
            if(sub.charAt(start)!=sub.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}