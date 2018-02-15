public class Calculator {
    public double executeCalculation(String string) {
        System.out.println(string);
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

        System.out.println(operationSymbol);
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

        return 999999;
    }
}
