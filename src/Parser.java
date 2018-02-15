import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public Match invoke(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        if (string.equals("")) {
            throw new IllegalArgumentException();
        }
        Pattern pattern = Pattern.compile("(\\d+)([-+*/])(\\d+)");
        Matcher matcher = pattern.matcher(string);
//        Pattern pattern = Pattern.compile("/d+/.?/d?([-+*/])/d+/.?/d");

//        String[] parts = pattern.split(string);

        if (matcher.find()) {
            double firstNumber = Double.parseDouble(matcher.group(1));
            double secondNumber = Double.parseDouble(matcher.group(3));

            char operationSymbol = matcher.group(2).charAt(0);

            return new Match(firstNumber, secondNumber, operationSymbol);
        }
        return null;
    }

    class Match {
        private final double firstNumber;
        private final double secondNumber;
        private final char operationSymbol;

        public Match(double firstNumber, double secondNumber, char operationSymbol) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
            this.operationSymbol = operationSymbol;
        }

        public double getFirstNumber() {
            return firstNumber;
        }

        public double getSecondNumber() {
            return secondNumber;
        }

        public char getOperationSymbol() {
            return operationSymbol;
        }

    }
}
