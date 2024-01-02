import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean expectedResult;

    public CheckIsAdultTest(int age, boolean expectedResult) {
        this.age = age;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {19, true},   // Пользователь старше 18 лет
                {17, false},  // Пользователь младше 18 лет
                {18, true},   // Пользователю 18 лет
                {21, true}    // Совершеннолетие в 21 год
        });
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Для возраста " + age + " ожидалось " + expectedResult, expectedResult, isAdult);
    }
}
