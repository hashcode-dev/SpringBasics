package com.hashcode.springbasics.dependencyinjection.xml;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanConfigDriver {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("spring-bean-di.xml");
        String injectingBeanName = cap.getBean("dependencyInjectionByName", DependencyInjectionByName.class).getSampInjectingBean().getName();
        System.out.println("Injecting Bean Name: " + injectingBeanName);
        cap.close();
    }
}
