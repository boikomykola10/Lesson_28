import org.testng.annotations.Test;

public class ForTest1 {
    @Test(dependsOnMethods = {"testTwo", "testThree"})
    public void testOne() {
        System.out.println("test method one");
    }
    @Test
    public void testTwo() {
        System.out.println("test method two");
    }
    @Test
    public void testThree() {
        System.out.println("test method three");
    }
}
