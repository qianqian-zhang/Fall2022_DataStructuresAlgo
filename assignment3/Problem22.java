package assignment3;

public class Problem22 {
    //22. Generate Parentheses
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(n, 0, 0, "");
        return ans;
    }

    private void helper(int n, int left, int right, String str) {
        if(left == n && right == n) {
            ans.add(str);
            return;
        }

        if(right > left || left < 0) return;

        if(left < n) {
            helper(n, left + 1, right, str + "(");
        }

        if(right < n) {
            helper(n, left, right +  1, str + ")");
        }
    }
}
