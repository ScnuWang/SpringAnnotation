package work.morem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.morem.bean.Department;
import work.morem.bean.Person;

public class MainTest {
    public static void main(String[] args) {
        /* Xml的方式
        * Bean注入到ApplicationContext之后，就可以对Bean进行管理
        *   主要是导入配置文件配置文件路径
        * */
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Department department = context.getBean(Department.class);
        System.out.println(department);

        /* 注解的方式
        *  AnnotationConfigApplicationContext的构造方法有多种
        *    1、注解配置类（一个或者多个）
        *    2、配置类包路径
        *    3、Bean工厂类
        * */
        ApplicationContext annotationContext = new AnnotationConfigApplicationContext("work.morem.config");
        Person person = (Person) annotationContext.getBean("person");
        System.out.println(person);
    }
}
