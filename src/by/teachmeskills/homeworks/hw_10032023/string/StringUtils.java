package by.teachmeskills.homeworks.hw_10032023.string;

public class StringUtils {
    private StringUtils() {
    }

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
        expression.deleteCharAt(6);
        expression.insert(6, " равно ");
        System.out.println(expression);
    }

    static void returnsTwoCharacters() {
        String str1 = "good";
        String str2 = "days";
        str1 = str1.concat(str2);
        int firstIndex = str1.length() / 2 -1;
        int lastIndex = str1.length() / 2 + 1;
        str1 = str1.substring(firstIndex, lastIndex);
        System.out.println(str1);
    }


}


