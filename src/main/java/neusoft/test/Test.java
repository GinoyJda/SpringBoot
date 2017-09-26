package neusoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-26
 * Time: 上午10:03
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext annotationContext = new AnnotationConfigApplicationContext("com.neusoft.beans");
        C c = annotationContext.getBean("c", C.class);// 创建bean的引用对象
        System.out.println(c.print());
    }

}
