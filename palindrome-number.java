import javax.lang.model.util.ElementScanner6;

class palindromeNumber {

    public static void main(String[] args) {

        // Edit Number to reverse to test different cases
        int x = 100;

        // Slow approach
        System.out.println(isPalindrome(x));
    }

    //Slow version of Palindrome true or false integer test.
    public static boolean isPalindrome(int x) {

        boolean val = true;
        // Is a number the same backwards.
        int length = String.valueOf(x).length();
        char[] arr = new char[length];
        String intString = String.valueOf(x);

         if (length == 1 && x >= 0){
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
}