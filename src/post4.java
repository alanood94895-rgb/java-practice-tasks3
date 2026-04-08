public class post4 {
    public static void main (String[] args){
        int[] arr = {1, 2, 4, 3, 5, 4, 6, 7};
        int[] result = post4(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] post4(int[] nums) {
        int lastIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                lastIndex = i;
            }
        }
        int newLength = nums.length - lastIndex - 1;
        int[] result = new int[newLength];

        for (int i = 0; i < newLength; i++) {
            result[i] = nums[lastIndex + 1 + i];
        }

        return result;
    }
}


