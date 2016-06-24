/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.inventi.playground;

/**
 *
 * @author Burbulas
 */
public class FirstBean {

    public FirstBean() {
    }

    public void helloWorldMethod(String v) {
        System.out.println("Hello, World! " + v);
    }

    public void helloVilniusMethod(String v) {
        System.out.println("Hello, Vilnius! " + v);
    }

    public void helloEveryoneMethod(String v) {
        System.out.println("Hello, Everyone! " + v);
    }

    public int randomIntGenerator() {
        return (int) (Math.random() * 11);
    }
}
