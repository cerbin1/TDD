public class Calculator {
    public double executeCalculation(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }

        if (string.equals("")) {
            throw new IllegalArgumentException();
        }

        Parser.Match match = new Parser().invoke(string);
        double firstNumber = match.getFirstNumber();
        double secondNumber = match.getSecondNumber();
        char operationSymbol = match.getOperationSymbol();

        switch (operationSymbol) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
        }

        throw new InvalidOperatorException();
    }

    class InvalidOperatorException extends RuntimeException {
    }
}
