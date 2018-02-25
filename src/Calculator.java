public class Calculator {
    public double executeCalculation(String string) {
        if (string == null || string.equals("")) {
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
                if (secondNumber == 0) {
                    throw new ArithmeticException("Dividing by zero!");
                }
                return firstNumber / secondNumber;
        }

        throw new InvalidOperatorException();
    }

    private class InvalidOperatorException extends RuntimeException {
    }
}
