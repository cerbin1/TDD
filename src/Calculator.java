import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public double executeCalculation(String string) {
        System.out.println(string);
        if (string == null) {
            throw new IllegalArgumentException();
        }

        if (string.equals("")) {
            throw new IllegalArgumentException();
        }
        Pattern pattern = Pattern.compile("/d+([-+*/])/d+");
        Matcher matcher = pattern.matcher(string);
//        Pattern pattern = Pattern.compile("/d+/.?/d?([-+*/])/d+/.?/d");

//        String[] parts = pattern.split(string);

        double firstNumber = Double.parseDouble(matcher.group(0));
        double secondNumber = Double.parseDouble(matcher.group(2));

        char operationSymbol = matcher.group(1).charAt(0);
        System.out.println(operationSymbol);
        switch (operationSymbol) {
            case '+':
                return firstNumber + secondNumber;
        }

//        double firstNumber = String.

        return 999999;
    }
}
