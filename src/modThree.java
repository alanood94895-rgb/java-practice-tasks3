public class modThree {
    public static void main(String[] args) {
        System.out.println(modThree(new int[]{2, 4, 6, 1}));

    }

    public static boolean modThree(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++) {
            boolean allEven = nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0;
            boolean allOdd  = nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0;

            if (allEven || allOdd) {
                return true;
            }
        }
        return false;
    }
}
