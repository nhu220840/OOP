package Testfile;

public class ProjectorTest {
    public static void main(String[] args) {
        Projector projectorTest = new Projector("Panasonic", "PT-LB303", "1080p", 3100);

        projectorTest.pullDown();
        projectorTest.stop();
        projectorTest.pullUp();
    }
}
