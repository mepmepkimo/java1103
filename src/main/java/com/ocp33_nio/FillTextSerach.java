package com.ocp33_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FillTextSerach {

    public static void main(String[] args) throws IOException {
        //總共寫了幾支JAVA程式
        String path = "C:\\Users\\MB-207\\Documents\\NetBeansProjects\\java1103\\src\\main\\java";
        Stream<Path> paths = Files.walk(Paths.get(path));
        paths.parallel()
                .filter(p -> p.toString().contains(".java")) 
            .filter(p -> {
            try {
                return Files.lines(p).filter(s -> s.contains)
            
            
        )
                    }
                }
                        .
        forEach(f -> {
            try {
                Path p = f.toAbsolutePath();
                System.out.print(++count + ".");
                System.out.print(f + ":");
                System.out.println(Files.readAttributes(p, BasicFileAttributes.class).creationTime());

            } catch (Exception e) {

            }
        });
    }

}
