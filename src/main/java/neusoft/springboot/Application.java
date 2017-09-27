package neusoft.springboot;
import neusoft.controller.TestController;
import neusoft.controller.TestRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "neusoft")
public class Application {
    public static void main(String[] args) {
        Object[] objects = {Application.class,TestController.class,TestRestController.class};
        SpringApplication.run(objects, args);
    }
}