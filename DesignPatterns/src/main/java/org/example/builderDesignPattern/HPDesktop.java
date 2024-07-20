package org.example.builderDesignPattern;

public class HPDesktop implements  Desktop{


    private String ram;
    private String ssd;
    private String cpu;


    @Override
    public String display() {
        return "DellDesktop{" +
                "ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}
