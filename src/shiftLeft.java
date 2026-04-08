public class shiftLeft {
    public static void main (String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] shifted = shiftLeft(array);

        for (int i = 0; i < shifted.length; i++) {
            System.out.print(shifted[i] + " ");
        }
    }
    public static int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int first = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }
}

