public class matchUp {
    public static void main (String[] args){
        int[] nums1 = {1, 4, 5};
        int[] nums2 = {2, 3, 6};
        System.out.println(matchUp (nums1, nums2));
    }
    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (nums1[i] != nums2[i] && diff <= 2) {
                count++;
            }
        }

        return count;
    }
}
