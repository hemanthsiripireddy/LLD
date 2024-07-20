package org.example.builderDesignPattern;

public class Director {

    public Desktop buildDesktop( DesktopBuilder desktopBuilder){
       return desktopBuilder.builder().buildCPU().buildRam().buildSSD().build();
    }
}
