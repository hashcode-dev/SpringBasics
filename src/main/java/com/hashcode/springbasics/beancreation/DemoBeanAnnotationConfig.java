package com.hashcode.springbasics.beancreation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class DemoBeanAnnotationConfig {

    @PostConstruct
    public void init() throws Exception {
        System.out.println("DemoBeanAnnotationConfig: Bean HelloWorld has been instantiated, and I'm the init() method");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("DemoBeanAnnotationConfig: Container has been closed, and I'm the destroy() method");
    }
}
