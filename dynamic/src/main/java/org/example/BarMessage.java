package org.example;

public class BarMessage implements Message {
    @Override
    public void printMessage() {
        System.out.println("Hello Bar!");
    }
}
