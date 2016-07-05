package lt.inventi.playground;


import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.camel.spring.Main;

/**
 * Created by dev on 16.7.4.
 */
public class FirstClass {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        System.out.println("bandymuxas");
        main.setApplicationContextUri("META-INF/application-context.xml");
        main.enableHangupSupport();
        main.start();
    }

}