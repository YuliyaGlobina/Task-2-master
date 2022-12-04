import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldBean1.getMessage());

        HelloWorld helloWorldBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Сравнение пары бинов HelloWorld" + (helloWorldBean1 == helloWorldBean2));
        System.out.println("Сравнение пары бинов Cat" + (cat1 == cat2));
    }
}