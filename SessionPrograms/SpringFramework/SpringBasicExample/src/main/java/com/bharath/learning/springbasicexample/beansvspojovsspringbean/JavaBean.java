package com.bharath.learning.springbasicexample.beansvspojovsspringbean;

import java.io.Serializable;

public class JavaBean implements Serializable {//Ejb


    public JavaBean() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private String text;

    private int number;
}
