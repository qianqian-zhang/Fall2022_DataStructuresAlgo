package assignment3;

public class Problem78 {
    //78. Subsets
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] nums, int i, List<Integer> subset, List<List<Integer>> ans){
        if(i == nums.length) {
            ans.add(new ArrayList(subset));
            return;
        }

        //don't add the number
        backtrack(nums, i + 1, subset, ans);

        //add the number
        subset.add(nums[i]);
        backtrack(nums, i + 1, subset, ans);
        subset.remove(subset.size() -  1);
    }
}
