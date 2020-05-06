package com.Java.Game2.InputData;

import java.io.File;

public class ImportFile {
    public static void main(String[] args) {
        File src = new File("D:/");
        File [] files = src.listFiles();

        for(File file : files) {
            System.out.println(file.getName());
        }
    }
}