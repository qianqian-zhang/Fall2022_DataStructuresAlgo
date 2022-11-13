package Question5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] arr = {0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11};
       int[] values = {1,4,5,10};
        System.out.println(Arrays.toString(getStartOfEachValues(arr, values)));
        //[5, -1, 11, 16]

    }

    private static int[] getStartOfEachValues(int[] arr, int[] values){
        int[] indexes = new int[values.length];

        for(int i = 0; i < values.length; i++) {
            indexes[i] = findStart(arr, values[i]);
        }


        return indexes;
    }
    private static int findStart(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int start = -1;

        while(l <= r) {
            int m = (l + r) / 2;
            if(nums[m] == target) {
                start = m;
                r = m - 1;//see if there is more on the left
            }
            else if(nums[m] > target) r = m - 1;
            else l = m + 1;
        }

        return start;
    }
}


