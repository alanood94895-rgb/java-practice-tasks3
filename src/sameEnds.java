public class sameEnds {
    public static void main (String[] args){
        System.out.println(sameEnds(new int[]{1, 2, 5, 2, 1}, 2));
    }
    public static boolean sameEnds(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }

}
