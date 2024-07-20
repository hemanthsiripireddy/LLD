package org.example;

import org.example.builderDesignPattern.DellDesktopBuilder;
import org.example.builderDesignPattern.Desktop;
import org.example.builderDesignPattern.DesktopBuilder;
import org.example.builderDesignPattern.Director;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DesktopBuilder desktopBuilder=new DellDesktopBuilder();
        Director director=new Director();
        Desktop desktop=director.buildDesktop(desktopBuilder);
        System.out.println(desktop.display());
        }
    }
