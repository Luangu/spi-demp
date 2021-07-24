package com;

import java.util.ServiceLoader;

public class SpiApp {

    public static void main(String[] args) {
        ServiceLoader<IPeople> shout = ServiceLoader.load(IPeople.class);
        for (IPeople iPeople : shout) {
            iPeople.sayHello();
        }
    }
}
