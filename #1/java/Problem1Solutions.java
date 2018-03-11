package solutions.java;

/**
 * Solutions for Project Euler Problem 1:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1Solutions {

    public static void main(String[] args) {
        System.out.println(solution1(1000));
    }

    public static int solution1(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (isMultipleOf3(i) || isMultipleOf5(i))
                sum += i;
        }

        return sum;
    }

    public static int solution2(int number) {
        int sum = 0, i = 1;

        while (i < number) {
            if (isMultipleOf3(i) || isMultipleOf5(i))
                sum += i;

            i++;
        }

        return sum;
    }

    public static int solution3(int number) {
        int sum = 0, i = 1;

        do {
            if (isMultipleOf3(i) || isMultipleOf5(i))
                sum += i;

            i++;
        } while (i < number);

        return sum;
    }

    private static boolean isMultipleOf3(int number) {
        return isMultiple(number, 3);
    }

    private static boolean isMultipleOf5(int number) {
        return isMultiple(number, 5);
    }

    private static boolean isMultiple(int number, int divisor) {
        return number % divisor == 0;
    }

}
