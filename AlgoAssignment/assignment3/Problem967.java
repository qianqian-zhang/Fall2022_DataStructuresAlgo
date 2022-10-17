package AlgoAssignment.assignment3;

public class Problem967 {
    //967. Numbers With Same Consecutive Differences
    List<Integer> list =  new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        for(int i = 1; i <= 9; i++) {
            backtrack(i, n - 1, k, i);
        }

        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    private void backtrack(int i, int n, int k, int num) {
        if(i > 9 || i < 0) return;

        if(n == 0) {
            if(!list.contains(num)){
                list.add(num);
            }
            return;
        }

        backtrack(i + k, n - 1, k, num * 10 + i + k);
        backtrack(i - k, n - 1, k, num * 10 + i - k);
    }
}
