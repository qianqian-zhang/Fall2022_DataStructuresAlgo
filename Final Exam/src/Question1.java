import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question1 {
    //Given an array of strings strs, group the anagrams together. You can return the answer in any order.
    //An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    //typically using all the original letters exactly once.
    //Input: strs = ["eat","tea","tan","ate","nat","bat"]
    //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strs)); //output: [[eat, tea, ate], [tan, nat], [bat]]

    }

    //time complexity: o(nlogn) sc: o(n)
    public static List<List<String>> groupAnagram(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            //sort the String
            char[] sortedArr = str.toCharArray();
            Arrays.sort(sortedArr);
            String sortedStr = String.valueOf(sortedArr);

            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
                ans.add(map.get(sortedStr));
            }

            map.get(sortedStr).add(str);
        }

        return ans;

    }
}
