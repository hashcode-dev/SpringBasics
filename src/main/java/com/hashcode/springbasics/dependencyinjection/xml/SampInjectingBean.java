package com.hashcode.springbasics.dependencyinjection.xml;

public class SampInjectingBean {
    private String name;

    public SampInjectingBean(final String name){
        System.out.println("SampInjectingBean: Inside the constructor of SampInjectingBean");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
