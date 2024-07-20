package org.example.builderDesignPattern;

public interface DesktopBuilder {

    public DesktopBuilder buildRam();
    public DesktopBuilder buildSSD();
    public DesktopBuilder buildCPU();

    public DesktopBuilder builder();

    public Desktop build();

}
