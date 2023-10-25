public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isPrimeDigit(ch)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public String f2(String str) {
        String[] words = str.split("\\s+"); // Split the input string into words using spaces as separators
        StringBuilder reversedStr = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedStr.append(words[i]);
            if (i > 0) {
                reversedStr.append(" "); // Add space between words
            }
        }

        return reversedStr.toString();
    }

    private boolean isPrimeDigit(char ch) {
        if (ch >= '0' && ch <= '9') {
            int digit = Character.getNumericValue(ch);
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                return true;
            }
        }
        return false;
    }
}