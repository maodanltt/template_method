package com.tywh.test.template;

public abstract class TestAbstractClass {

//    protected abstract void run();
    protected void behave(String type) {
        System.out.println("abstract behave()------------------->");
        if ("run".equals(type)) {
            run();
        } else {
            sleep();
        }
    }

    protected void run() {
        System.out.println("abstract run()--------------------->");
    }

    protected void sleep() {
        System.out.println("abstract sleep()--------------------->");
    }

}
