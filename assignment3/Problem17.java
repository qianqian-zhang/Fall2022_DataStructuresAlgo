package assignment3;

public class Problem17 {
    //17. Letter Combinations of a Phone Number
    Map<Character, String> map = new HashMap<>();
    String digits;
    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        if(digits.length() == 0) return ans;

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(0, new StringBuilder());
        return ans;
    }

    private void backtrack(int index, StringBuilder sb) {
        if(index == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        for(char c : map.get(digits.charAt(index)).toCharArray()){
            sb.append(c);
            backtrack(index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
