package tdcc.demo2.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProgram {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
        MasterStudentService service = context.getBean("service", MasterStudentService.class);
        service.graduateAll();
    }
}
