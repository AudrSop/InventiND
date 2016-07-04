package lt.inventi.playground;


import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dev on 16.7.4.
 */
public class FirstClass {
    public static void main(String[] args) throws Exception {
        AbstractXmlApplicationContext abstractXml = new ClassPathXmlApplicationContext("META-INF/application-context.xml");
        abstractXml.start();
        Thread.sleep(2000);
        abstractXml.stop();
        abstractXml.destroy();
    }

}