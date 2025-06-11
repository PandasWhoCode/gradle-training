package gradle.training.lib;
import gradle.training.lib2.Lib2;
import org.junit.jupiter.api.Test;

class LibTest {
    @Test
    void libTest() {
        Lib2 lib2 = new Lib2();
        System.out.println("Hello, LibTest!");
    }
}
