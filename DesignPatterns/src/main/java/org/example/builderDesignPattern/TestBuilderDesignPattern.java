package org.example.builderDesignPattern;

public class TestBuilderDesignPattern {
    public static  void test(){
        DesktopBuilder desktopBuilder=new DellDesktopBuilder();
        Director director=new Director();
        Desktop desktop=director.buildDesktop(desktopBuilder);
        System.out.println(desktop.display());

    }
}
