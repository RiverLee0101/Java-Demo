package org.apache.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 11101453
 * @Date: 2019/9/24
 */
public class Provider {
    
    public static void main(String[] args) throws Exception{
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        System.out.println("System provider started!");
        System.in.read();   // press any key to exit
    }
}
