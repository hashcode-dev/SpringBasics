package com.hashcode.springbasics.beancreation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DemoBeanPrgConfig implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DemoBeanPrgConfig: Bean HelloWorld has been "	+ "instantiated and I'm the " + "init() method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DemoBeanPrgConfig: Container has been closed "+ "and I'm the destroy() method");
    }
}
