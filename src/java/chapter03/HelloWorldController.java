/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author yury
 */
@Named(value = "helloWorldController")
@RequestScoped
public class HelloWorldController {
    
    private String hello;

    /**
     * Creates a new instance of HelloWorldController
     */
    public HelloWorldController() {
        this.hello = "Hola Yury!!!";
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
    
}