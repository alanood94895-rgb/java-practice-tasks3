public class sum13 {
    public static void main (String[] args){
        System.out.println(sum13 (new int[]{13, 1, 2, 13, 2, 1}));
    }
    public static int sum13 (int [] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++; // skip the next number as well
            } else {
                sum += nums[i];
            }
        }

        return sum;

    }
}
