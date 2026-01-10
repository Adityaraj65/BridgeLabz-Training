class AddStrings {

    // LeetCode method
    public static String addStrings(String num1, String num2) {

        int i = num1.length() - 1;   // pointer for num1
        int j = num2.length() - 1;   // pointer for num2
        int carry = 0;

        StringBuilder result = new StringBuilder();

        // loop until both strings are processed or carry exists
        while (i >= 0 || j >= 0 || carry != 0) {

            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;

            result.append(sum % 10);   // current digit
            carry = sum / 10;          // carry for next step

            i--;
            j--;
        }

        return result.reverse().toString();
    }

    // main method for testing
    public static void main(String[] args) {

        String num1 = "456";
        String num2 = "77";

        String sum = addStrings(num1, num2);

        System.out.println("Sum = " + sum);
    }
}
