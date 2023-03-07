package by.teachmeskills.homeworks.hw_10032023.string;

public class StringUtils {


    static void returnsArithmeticExpression() {
        int number1 = 3;
        int number2 = 56;
        StringBuilder arithmeticExpression = new StringBuilder();
        arithmeticExpression.append(number1).append(" + ").append(number2).append(" = ").append(number1 + number2).append("\n");
        arithmeticExpression.append(number1).append(" - ").append(number2).append(" = ").append(number1 - number2).append("\n");
        arithmeticExpression.append(number1).append(" * ").append(number2).append(" = ").append(number1 * number2);
        System.out.println(arithmeticExpression);
    }

    static void replaceCharacter() {

        StringBuilder expression = new StringBuilder("3 + 2 = 5");
        expression.deleteCharAt(6).insert(6, " равно ");
        System.out.println(expression);
    }

    static void returnsTwoCharacters(String str1, String str2) {
        str1 = str1.concat(str2);
        int firstIndex = str1.length() / 2 - 1;
        int lastIndex = str1.length() / 2 + 1;
        str1 = str1.substring(firstIndex, lastIndex);
        System.out.println(str1);
    }

    static void palindrome(String text) {
        text = text.replaceAll(",", "");
        String[] arrayText = text.split(" ");
        for (String str : arrayText) {
            StringBuilder palindrome = new StringBuilder(str).reverse();
            if (str.equalsIgnoreCase(palindrome.toString())) {
                System.out.print(str + "; ");
            }
        }
        System.out.println();
    }

    static void splitString(String text) {
        String[] arrayText = text.split(" ");
        for (String s : arrayText) {
            System.out.println(s);
        }
    }
}


