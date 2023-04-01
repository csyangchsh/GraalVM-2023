package org.example;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        var clazz = Class.forName("org.example." + args[0]);
        clazz.getMethod("printMessage").invoke(clazz.getConstructor().newInstance());
    }
}