class ReverseInt {
    // Reversing an Integer Value passed in.
    public static void main(String[] args) {

        // Edit Number to reverse to test different cases
        int numberToReverse = 123;

        System.out.println(reverse(numberToReverse));
    }

    // Method that reverse an int passed into it.
    public static int reverse(int x) {

        // Gets the max and min reversed Integer Value to account for number becoming
        // bigger then 32-bit
        int maxReversed = Integer.MAX_VALUE;
        int minRevrsed = Integer.MIN_VALUE;

        // reversed is stored as long and holds a bigger value then Integer.MAX_VALUE.
        long reversed = 0;

        // Pop is meant to get the last value of an object
        int pop;

        // While loop to constuct reversed value.
        while (x != 0) {
            // pop = 123 % 10 = 12.3 = 3
            // pop = 12 % 10 = 1.2 = 2
            // pop = 1 % 10 = 0.1 = 1
            pop = x % 10;

            // 0 = (0 * 10) + 3;
            // 3 = (3 * 10) + 2; 30 + 2 = 32;
            // 32 = (32 * 10) + 1; 320 + 1 = 321;
            // 321 == 123 reversed! 
            reversed = (reversed * 10) + pop;

            //Condition for reversed max and min values that might become bigger than 32-bit.
            if (reversed > maxReversed || reversed < minRevrsed) {
                return 0;
            }

            // How for loop is ended.
            // 123 / 10 = x = 12;
            // 12 / 10 = x = 1;
            // 1 / 10 = x = 0;
            // x = 0 while loop stops
            x /= 10;
        }
        // return reversed long as an Integer.
        return (int) reversed;
    }

}
