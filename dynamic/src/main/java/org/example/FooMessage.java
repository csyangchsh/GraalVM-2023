package org.example;

public class FooMessage implements Message {
    @Override
    public void printMessage() {
        System.out.println("Hello Foo!");
    }
}
