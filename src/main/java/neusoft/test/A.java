package neusoft.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-26
 * Time: 上午10:00
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class A {

    @Bean(name = "b")
    public B getB(){
        return new B();
    }
    @Bean(name = "c")
    public C getC(){
        return new C();
    }
}
