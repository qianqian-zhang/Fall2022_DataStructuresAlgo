public class Question3 {
    //Given a string s of '(' , ')' and lowercase English characters.
    //Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions )
    // so that the resulting parentheses string is valid and return any valid string.
    //Input: s = "lee(t(c)o)de)"
    //Output: "lee(t(c)o)de"

    public static void main(String[] args) {
        String str = "lee(t(c)o)de)";
        System.out.println(removeParentheses(str));//lee(t(c)o)de
        String str2 = "a)b(c)d";
        System.out.println(removeParentheses(str2));//ab(c)d
        String str3 = "))((";
        System.out.println(removeParentheses(str3));//""
    }

    //time complexity: o(m + n)
    public static String removeParentheses(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0; //count (s

        for(char c : str.toCharArray()) {
            if(c != ')'){
                sb.append(c);
                if(c == '(') count++;
            }else if(count > 0) {
                sb.append(c);
                count--;
            }
        }

        //delete all the extra (s
        for(int i = sb.length() - 1; i >= 0 && count > 0; i--) {
            if(sb.charAt(i) == '(') {
                count--;
                sb.deleteCharAt(i);
            }
        }

        return sb.toString();
    }
}
