package com.hashcode.springbasics.bean;

public class DemoBeanXMLConfig {
    // Custom init method
    public void init() throws Exception {
        System.out.println("DemoBeanXMLConfig: Bean HelloWorld has been instantiated, and I'm the init() method");
    }

    // Custom destroy method
    public void destroy() throws Exception {
        System.out.println("DemoBeanXMLConfig: Container has been closed, and I'm the destroy() method");
    }
}
