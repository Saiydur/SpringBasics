package installation.legacy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        IExam iExamMid = applicationContext.getBean("mid", IExam.class);
        IExam iExamFinal = applicationContext.getBean("final",IExam.class);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime localDateTime = LocalDateTime.now();
        String localDateFormat = dateTimeFormatter.format(localDateTime);

        if (localDateFormat.compareTo(String.valueOf(iExamFinal))<0){
            System.out.println("Final On Going");
        }
        else if (localDateFormat.compareTo(String.valueOf(iExamMid))<0){
            System.out.println("Mid On Going");
        }
        else
        {
            System.out.println("Nothing Happening");
        }
    }
}
