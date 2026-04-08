public class fizzArray {
    public static void main (String[] args){
        System.out.println(fizzArray(6));
    }
    public static int[] fizzArray (int n){
        int[] array  = new int[n];
        for (int i = 0; i<n; i++) {
            array [i] = i;
        }

        return array ;

    }
}
