package com.ocp33_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyDemo {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("src\\main\\java\\com\\ocp33_nio\\a.txt");
        Path target = Paths.get("src\\main\\java\\com\\ocp33_nio\\b.txt");
        Files.copy(source, target,StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copy ok");
    }

}
