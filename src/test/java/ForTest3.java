import org.testng.annotations.Test;

public class ForTest3 {

    @Test(groups = {"test-group"})
    public void testMethodOne() {
        System.out.println("Test method one belonging to test-group.");
    }

    @Test(groups = {"exclude-group"})
    public void testMethodTwo() {
        System.out.println("Test method two not belonging to test-group.");
    }

    @Test(groups = {"test-group"})
    public void testMethodThree() {
        System.out.println("Test method three belonging to test-group.");
    }
}

