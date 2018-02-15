import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNullArgument() {
        // given
        Calculator calculator = new Calculator();

        // when
        calculator.executeCalculation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnEmptyString() {
        // before
        Calculator calculator = new Calculator();

        // when
        calculator.executeCalculation("");
    }

    @Test
    public void shouldSumTwoNumbers() {
        // before
        Calculator calculator = new Calculator();
        String operation = "2+2";

        // when
        double result = calculator.executeCalculation(operation);

        // then
        assertEquals(4, result, 0);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        // before
        Calculator calculator = new Calculator();
        String operation = "2-2";

        // when
        double result = calculator.executeCalculation(operation);

        // then
        assertEquals(0, result, 0);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        // before
        Calculator calculator = new Calculator();
        String operation = "2*2";

        // when
        double result = calculator.executeCalculation(operation);

        // then
        assertEquals(4, result, 0);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        // before
        Calculator calculator = new Calculator();
        String operation = "4/2";

        // when
        double result = calculator.executeCalculation(operation);

        // then
        assertEquals(2, result, 0);
    }

   /* @Test(expected = Calculator.InvalidOperatorException.class) // zrobilbym test, gdzie jest znak rozny niz +-* /, aby metoda executeCalculation rzucala wyjatek
    // (po switchu, jezeli nie bedzie znaku znaku operacji w zadnym casie, rzuca sie wyjatek), myslalem zeby zmockowac metode invoke klasy Parser, ale ona rzuca
    // obiekt Match, i nie wiem jak cos takiego sie mockuje o ile w ogole sie to robi. Musialbym w sumie zmockowac metode getOperationChar(), ale stad nie moge jej zamockowac.
    public void shouldThrowExceptionOnInvalidOperator() {
        // before
        Calculator calculator = new Calculator();
        String operation = "4=4";

        // when
        calculator.executeCalculation(operation);
    }*/

}
