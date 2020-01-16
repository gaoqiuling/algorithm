import com.itisacat.algo.sourceCode.aop.Calculator;
import com.itisacat.algo.sourceCode.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SourceCodeTest {
    @Test
    public void testBean() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("IOC容器创建完成........");

        Object bean1 = app.getBean("jamesFactoryBean");
        Object bean2 = app.getBean("jamesFactoryBean");//取Money
        System.out.println("bean的类型=" + bean1.getClass());
        System.out.println(bean1 == bean2);
        Object bean3 = app.getBean("&jamesFactoryBean");//取Money

        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println("bean的类型2=" + name);
        }


        //Calculator c = new Calculator();
        Calculator c = app.getBean(Calculator.class);
        int result = c.div(4, 2);
        System.out.println(result);
        app.close();
    }
}
