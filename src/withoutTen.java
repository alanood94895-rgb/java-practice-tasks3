public class withoutTen {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 2, 3, 10, 4};
        int[] result = withoutTen(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                result[pos] = nums[i];
                pos++;
            }
        }

        return result;
    }

}
