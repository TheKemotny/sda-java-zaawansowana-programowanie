package pl.thekemotny.taskszerotonine.taskseven;

import java.util.ArrayList;
import java.util.List;

public class MagazineList {
    private final List<String> clip = new ArrayList<>();
    private final int size;

    public MagazineList(final int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public boolean loadBullet(String bullet) {
        if (clip.size() < size()) {
            clip.add(bullet);
            return true;
        } else {
            return false;
        }
    }

    public boolean isLoaded() {
        return !clip.isEmpty();
    }

    public void shot() {
        if (isLoaded()) {
            System.out.println(clip.remove(clip.size() - 1));
        } else {
            System.out.println("EMPTY CLIP");
        }
    }
}
