package pl.thekemotny.taskseven;

public class TaskSeven {
    public static void main(String[] args) {
        MagazineList magazine = new MagazineList(10);
        System.out.println(magazine.isLoaded());
        magazine.loadBullet("ALA");
        magazine.loadBullet("MA");
        magazine.loadBullet("KOTA");
        magazine.loadBullet("DEAD");
        magazine.loadBullet("BEEF");
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
        System.out.println(magazine.isLoaded());
    }
}
