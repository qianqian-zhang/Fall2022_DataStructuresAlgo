package assignment3;

public class Problem46 {
    //46. Permutations
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> permutation, List<List<Integer>> result) {
        if(permutation.size() == nums.length) {
            result.add(new ArrayList(permutation));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(permutation.contains(nums[i])) continue;
            permutation.add(nums[i]);
            backtrack(nums, permutation, result);
            permutation.remove(permutation.size() - 1);
        }
    }
}
