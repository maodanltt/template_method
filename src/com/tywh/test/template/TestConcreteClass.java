package com.tywh.test.template;

public class TestConcreteClass extends TestAbstractClass {

    @Override
    protected void run() {
        System.out.println("TestConcreteClass------------run()");
    }

    @Override
    protected void sleep() {
        System.out.println("TestConcreteClass------------sleep()");

    }
}
