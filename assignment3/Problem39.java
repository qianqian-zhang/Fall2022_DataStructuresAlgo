package assignment3;

public class Problem39 {
    //39. Combination Sum
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(candidates, new ArrayList<>(), target, 0);
        return ans;
    }

    private void backtrack(int[] candidates, List<Integer> combination, int cur_target, int i) {
        //base case
        if(cur_target == 0) {
            ans.add(new ArrayList(combination));
            return;
        }

        if(i == candidates.length) {
            return;
        }

        //pick current element
        if(candidates[i] <= cur_target) {
            combination.add(candidates[i]);
            backtrack(candidates, combination, cur_target - candidates[i], i);
            combination.remove(combination.size() - 1);
        }

        //don't pick current element
        backtrack(candidates, combination, cur_target, i + 1);
    }
}
