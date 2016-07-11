/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.inventi.playground;

import org.apache.camel.Body;

/**
 *
 * @author Burbulas
 */
public class FirstBean {

    public FirstBean() {
    }

    public void helloWorldMethod(@Body String v) {
        System.out.println("Hello, World! " + v);
    }

    public void helloVilniusMethod(@Body String v) {
        System.out.println("Hello, Vilnius! " + v);
    }

    public void helloEveryoneMethod(@Body String v) {
        System.out.println("Hello, Everyone! " + v);
    }

    public int randomIntGenerator() {
        return (int) (Math.random() * 11);
    }
}
