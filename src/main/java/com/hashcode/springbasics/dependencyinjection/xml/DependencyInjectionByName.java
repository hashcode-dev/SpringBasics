package com.hashcode.springbasics.dependencyinjection.xml;

public class DependencyInjectionByName {
    private  SampInjectingBean sampInjectingBean;

    public SampInjectingBean getSampInjectingBean() {
        return sampInjectingBean;
    }

    public void setSampInjectingBean(SampInjectingBean sampInjectingBean) {
        this.sampInjectingBean = sampInjectingBean;
    }
}
