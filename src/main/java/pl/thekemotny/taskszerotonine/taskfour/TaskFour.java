package pl.thekemotny.taskszerotonine.taskfour;

public class TaskFour {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("ALA" , "ALA");
        storage.addToStorage("ALA" , "MA");
        storage.addToStorage("KOTA" , "ALA");
        storage.printValues("ALA");
        storage.findKeys("MA");
    }
}
