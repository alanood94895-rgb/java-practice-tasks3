public class lucky13 {
    public static void main (String[] args){
        System.out.println(lucky13(new int []{2, 4, 7}));
    }
    public static boolean lucky13 (int [] nums){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
