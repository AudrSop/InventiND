/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.inventi.playground;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Burbulas
 */
public class FirstClass {

    public static void main(String[] args) throws Exception {
        AbstractXmlApplicationContext abstractXml = new ClassPathXmlApplicationContext("META-INF/application-context.xml");
        abstractXml.start();
        Thread.sleep(20000);
        abstractXml.stop();
        abstractXml.destroy();
    }

}


