package com.tywh.test.template;

public class Client {

    public static void main(String[] args) {
        TestAbstractClass a = new TestConcreteClass();
        a.behave("a");
    }
}
