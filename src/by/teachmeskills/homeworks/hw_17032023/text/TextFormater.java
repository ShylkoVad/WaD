package by.teachmeskills.homeworks.hw_17032023.text;

public class TextFormater {
    public static void returnNumberWords(String str) {
        String[] arrayText = str.split(" ");
        if (arrayText.length >= 3 & arrayText.length <= 5) {
            boolean numberWords = true;
            System.out.print(numberWords);
        } else {
            boolean numberWords = false;
            System.out.println(numberWords);
        }
        System.out.println();
    }

    public static void checkPalindromeString(String strPalindrome) {

        strPalindrome = strPalindrome.replaceAll("\\p{P}", "");
        strPalindrome = strPalindrome.replaceAll("  ", " ");
        String[] arrayText = strPalindrome.split(" ");

        for (String s : arrayText) {
            StringBuilder palindrome = new StringBuilder(s).reverse();
            if (s.equalsIgnoreCase(palindrome.toString())) {
                boolean numberWords = true;
                System.out.println(numberWords);
                System.out.print(s + "; ");
            } else {
                boolean numberWords = false;
                System.out.println(numberWords);
            }
        }
    }
}
