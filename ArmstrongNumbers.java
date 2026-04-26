public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int num = 1; num <= 1000; num++) {
            int original = num;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }

            num = original; // reset num
        }
    }
}
