import org.junit.Assert;
import org.junit.Test;

public class ParserTest {
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNullParameter() {
        // given
        Parser parser = new Parser();

        // when
        parser.invoke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnEmptyString() {
        // given
        Parser parser = new Parser();

        // when
        parser.invoke("");
    }

    @Test
    public void shouldGetAdditionMatch() {
        // given
        Parser parser = new Parser();

        // when
        Parser.Match match = parser.invoke("2+3");

        // then
        Assert.assertEquals(2.0, match.getFirstNumber(), 0);
        Assert.assertEquals(3.0, match.getSecondNumber(), 0);
        Assert.assertEquals('+', match.getOperationSymbol());
    }

    @Test
    public void shouldGetSubtractionMatch() {
        // given
        Parser parser = new Parser();

        // when
        Parser.Match match = parser.invoke("5-3");

        // then
        Assert.assertEquals(5.0, match.getFirstNumber(), 0);
        Assert.assertEquals(3.0, match.getSecondNumber(), 0);
        Assert.assertEquals('-', match.getOperationSymbol());
    }

    @Test
    public void shouldGetMultiplicationMatch() {
        // given
        Parser parser = new Parser();

        // when
        Parser.Match match = parser.invoke("2*3");

        // then
        Assert.assertEquals(2.0, match.getFirstNumber(), 0);
        Assert.assertEquals(3.0, match.getSecondNumber(), 0);
        Assert.assertEquals('*', match.getOperationSymbol());
    }

    @Test
    public void shouldGetDivisionMatch() {
        // given
        Parser parser = new Parser();

        // when
        Parser.Match match = parser.invoke("4/2");

        // then
        Assert.assertEquals(4.0, match.getFirstNumber(), 0);
        Assert.assertEquals(2.0, match.getSecondNumber(), 0);
        Assert.assertEquals('/', match.getOperationSymbol());
    }

    @Test(expected = Parser.WrongInputException.class)
    public void shouldReturnExceptionOnWrongInput() {
        // given
        Parser parser = new Parser();

        // when
        parser.invoke("lorem");
    }
}
