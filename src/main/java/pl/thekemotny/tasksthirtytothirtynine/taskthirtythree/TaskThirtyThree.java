package pl.thekemotny.tasksthirtytothirtynine.taskthirtythree;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskThirtyThree {
    public static void readAllDotFiles(String suffix) throws IOException {
        File file = new File(".");
        //System.out.println(readFile(file, suffix));
        System.out.println(readAllDotFilesWithList(file, ".java"));
    }

    private static String readAllDotFilesWithList(File file, String suffix) {
        List<File> directories = new ArrayList<>();
        directories.add(file);
        String result = "";
        while (!directories.isEmpty()) {
            File file1 = directories.remove(0);
            File[] files = file1.listFiles();
            for (File file2: files) {
                if(file2.isDirectory()){
                    directories.add(file2);
                } else {
                    final String name = file2.getName();
                    if(name.endsWith(suffix)) {
                        result = result.concat(name + "\n");
                    }
                }
            }
        }
        return result;
    }

    private static String readFile(File file, String suffix) {
        File[] files = file.listFiles();
        String result = "";

        for (File file1: files) {
            if(file1.isDirectory()) {
                result = result.concat(readFile(file1, suffix));
            } else {
                final String name = file1.getName();
                if(name.endsWith(suffix)) {
                    System.out.println(name);
                    //return name + "\n";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        readAllDotFiles(".java");
    }
}
