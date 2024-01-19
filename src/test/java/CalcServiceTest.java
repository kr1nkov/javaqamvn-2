import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.Calcservice;

public class CalcServiceTest {

    @Test
    public void shouldQuantityMonthForRelax() {
        Calcservice service = new Calcservice();

        int actual = service.calculate(10000, 3000, 20000);
        int expected = 7;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityMonthForRelax2() {
        Calcservice service = new Calcservice();

        int actual = service.calculate(100000, 60000, 150000);
        int expected = 6;


        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "MONEY.csv")
    public void testWithParams(int income, int expenses, int threshold, int expected) {
        Calcservice service = new Calcservice();

        int actual = service.calculate(income, expenses, threshold);



}
}