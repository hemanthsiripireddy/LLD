package org.example.builderDesignPattern;

public class HPDesktopBuilder implements DesktopBuilder{

    private  Desktop desktop;

//    public HPDesktopBuilder() {
//        this.desktop=new HPDesktop();
//    }
    public DesktopBuilder builder(){
        desktop=new HPDesktop();
        return this;
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

    public Desktop build(){
        return desktop;
    }
}
