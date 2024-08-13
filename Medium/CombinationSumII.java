// https://leetcode.com/problems/combination-sum-ii/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the array to handle duplicates
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            // Break if the current candidate exceeds the target
            if (candidates[i] > target) break;

            tempList.add(candidates[i]);
            backtrack(result, tempList, candidates, target - candidates[i], i + 1); // i + 1 since each number can only be used once
            tempList.remove(tempList.size() - 1); // Backtrack, remove the last added element
        }
    }

    public static void main(String[] args) {
        CombinationSumII obj = new CombinationSumII();
        int[] candidates1 = {10, 1, 2, 7, 6, 1, 5};
        int target1 = 8;
        System.out.println(obj.combinationSum2(candidates1, target1));
        
        int[] candidates2 = {2, 5, 2, 1, 2};
        int target2 = 5;
        System.out.println(obj.combinationSum2(candidates2, target2));
    }
}
