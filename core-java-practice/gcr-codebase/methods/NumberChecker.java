public class NumberChecker {

    public static void main(String[] args) {

        int number = 153;

        // counting digits
        int count = countDigits(number);

        // storing digits in array
        int[] digits = storeDigits(number, count);

        // checking duck number
        System.out.println("Is Duck Number : " + isDuckNumber(digits));

        // checking armstrong number
        System.out.println("Is Armstrong Number : " + isArmstrong(number, digits));

        // finding largest and second largest digit
        findLargestAndSecondLargest(digits);

        // finding smallest and second smallest digit
        findSmallestAndSecondSmallest(digits);
    }

    // method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // method to store digits in array
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // method to check duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // method to check armstrong number
    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }
        return sum == number;
    }

    // method to find largest and second largest digit
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit : " + largest);
        System.out.println("Second largest digit : " + secondLargest);
    }

    // method to find smallest and second smallest digit
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }

        System.out.println("Smallest digit : " + smallest);
        System.out.println("Second smallest digit : " + secondSmallest);
    }
}

