package Quiz1;

public class Question1 {
    //Given an array, rotate the array to the right by k steps, where k is non-negative.

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        int rotate = k % n;

        reverse(nums, 0, n - rotate - 1);
        reverse(nums, n - rotate, n - 1);
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int a, int b) {
        while(a < b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;

            a++;
            b--;
        }

    }

}
