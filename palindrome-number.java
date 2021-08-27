import javax.lang.model.util.ElementScanner6;

//TODO: Add Comments and go over understanding later.
class palindromeNumber {

    public static void main(String[] args) {

        // Edit Number to reverse to test different cases
        int x = 100;

        // Slow approach
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome_2(x));
        System.out.println(isPalindrome_1(x));
    }

    // Slow version of Palindrome true or false integer test.
    public static boolean isPalindrome(int x) {

        boolean val = true;
        // Is a number the same backwards.
        int length = String.valueOf(x).length();
        char[] arr = new char[length];
        String intString = String.valueOf(x);

        if (length == 1 && x >= 0) {
            return true;
        }

        for (int i = 0; i < length; i++) {
            arr[i] = intString.charAt(i);

            String firstVal = String.valueOf(arr[0]);

            if (arr[0] == arr[1] && length == 2) {
                return true;
            } else if (arr[0] != arr[0 + i] && length == 2) {
                return false;
            }

            if (firstVal.equals("-")) {
                val = false;
                return val;
            }
        }
        int counter = 0;
        int newLength = length - 1;
        for (int i = newLength; i > 0; i--) {
            if (arr[counter] != arr[i]) {
                val = false;
                return val;
            }
            counter++;
        }
        return val;
    }

    // Best Java Solution
    public static boolean isPalindrome_1(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--))
                return false;
        }
        return true;
    }

    public static boolean isPalindrome_2(int x) {

        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reversed_int = 0;

        while (x > reversed_int) {
            int pop = x % 10;

            x /= 10;

            reversed_int = (reversed_int * 10) + pop;
        }

        if (x == reversed_int || x == reversed_int / 10) {
            return true;
        } else {
            return false;
        }

    }

}