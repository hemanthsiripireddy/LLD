package org.example.builderDesignPattern;

public class DellDesktopBuilder implements  DesktopBuilder{

    private Desktop desktop;
    public DellDesktopBuilder(){
        desktop=new DellDesktop();
    }
    @Override
    public DesktopBuilder buildRam() {
        desktop.setRam("4GB HP");
        return this;

    }

    @Override
    public DesktopBuilder buildSSD() {
        desktop.setSsd("450GB HP");
        return this;

    }

    @Override
    public DesktopBuilder buildCPU() {
        desktop.setCpu("2.5GHz HP");
        return this;
    }

    @Override
    public DesktopBuilder builder() {
        desktop=new DellDesktop();
        return this;
    }

    public Desktop build(){
        return desktop;
    }
}
