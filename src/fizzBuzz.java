public class fizzBuzz {
    public static void main(String[] args) {
        String[] result = fizzBuzz(1, 16);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static String[] fizzBuzz(int start, int end) {
        String[] output = new String[end - start];

        for (int i = 0; i < output.length; i++) {
            int num = start + i;

            if (num % 15 == 0) {
                output[i] = "FizzBuzz";
            } else if (num % 3 == 0) {
                output[i] = "Fizz";
            } else if (num % 5 == 0) {
                output[i] = "Buzz";
            } else {
                output[i] = Integer.toString(num);
            }
        }

        return output;
    }
}
