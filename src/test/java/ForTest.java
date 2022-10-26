import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ForTest {
    @Parameters({"login"})
    @Test(enabled = true)
    public void firstTest(String param) {
        System.out.println(param);
    }
    @Parameters({"password"})
    @Test
    public void secondTest(String param) {
        System.out.println(param);
    }
    @Parameters({"login", "password"})
    @Test
    public void thirdTest(String param, String paramTwo) {
        System.out.println(param);
        System.out.println(paramTwo);
    }
}
