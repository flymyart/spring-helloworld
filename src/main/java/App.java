import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");

        boolean comparing = bean == bean1;
        System.out.println(bean);
        System.out.println(bean1);
        System.out.println(comparing);

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");

        boolean comparing1 = beanCat == beanCat1;
        System.out.println(beanCat);
        System.out.println(beanCat1);
        System.out.println(comparing1);
    }
}