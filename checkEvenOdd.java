public class checkEvenOdd{
    public int EvenOddDigitsSum(int input1, String input2) {
        int sum = 0;
        boolean isEven = input2.equals("even");

        while (input1 > 0) {
            int digit = input1 % 10;
            if (isEven && digit % 2 == 0) {
                sum += digit;
            } else if (!isEven && digit % 2 != 0) {
                sum += digit;
            }
            input1 /= 10;
        }

        return sum;
    }
}
