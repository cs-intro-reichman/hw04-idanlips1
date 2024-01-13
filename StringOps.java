public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // Test capVowelsLowRest;
        // String Test = "One two tHRee world";
        // System.out.println(capVowelsLowRest(Test));
        // Test camelCase;
        // String Test = " Intro to coMputer Science";
        // System.out.println(camelCase(Test));
        // Test allIndexOf
        String test = "Hello world";
        char check = 'l';
        int[] array = allIndexOf(test, check);
        for (int i = 0; i < array.length; i++) {
            System.out.print("{" + array[i] +"}");
        }

    }

    public static String capVowelsLowRest(String string) {
        // Write your code here:
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            char curChar = string.charAt(i);
            if (isVowel(curChar)) {
                if (curChar >= 'A' && curChar <= 'Z') {
                    newString += (char) curChar;
                } else {
                    newString += (char) (curChar - 32);
                }

            } else if (!isVowel(curChar)) {
                if (curChar >= 'A' && curChar <= 'Z') {
                    newString += (char) (curChar + 32);
                } else if (curChar >= 'a' && curChar <= 'z') {
                    newString += (char) curChar;
                } else {
                    newString += (char) curChar;
                }

            }
        }
        return newString;
    }

    public static String camelCase(String string) {
        // Write your code here:
        String newString = "";
        int index = 0;
        while (string.charAt(index) == ' ') {
            index++;
        }
        String newWord = string.substring(index);
        if (newWord.charAt(0) >= 'A' && newWord.charAt(0) <= 'Z') {
            newString += (char) (newWord.charAt(0) + 32);
        } else if (newWord.charAt(0) >= 'a' && newWord.charAt(0) <= 'z') {
            newString += (char) (newWord.charAt(0));
        }
        for (int i = 1; i < newWord.length(); i++) {
            char curChar = newWord.charAt(i);
            if (curChar >= 'A' && curChar <= 'Z' && newWord.charAt(i - 1) == ' ') {
                newString += (char) (curChar);
            } else if (curChar >= 'A' && curChar <= 'Z' && newWord.charAt(i - 1) != ' ') {
                newString += (char) (curChar + 32);
            } else if (curChar >= 'a' && curChar <= 'z' && newWord.charAt(i - 1) == ' ') {
                newString += (char) (curChar - 32);
            } else if (curChar >= 'a' && curChar <= 'z' && newWord.charAt(i - 1) != ' ') {
                newString += (char) (curChar);
            }
        }
        return newString;
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        int arrayLength = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arrayLength++;
            }
        }
        int[] indexArray = new int[arrayLength];
        int currentIndex = 0;
        for (int k = 0; k < string.length(); k++) {
            if (string.charAt(k) == chr) {
                indexArray[currentIndex++] = k;
            }
        }

        return indexArray;
    }

    public static boolean isVowel(char chr) {
        boolean v = false;
        if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
            v = true;
        } else if (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U') {
            v = true;
        } else {
            return v;
        }
        return v;
    }

}
