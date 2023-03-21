package pl.thekemotny;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(TaskOne.sort(List.of("A", "a", "z")));
        System.out.println(TaskTwo.sort(List.of("A", "a", "z")));
    }
}