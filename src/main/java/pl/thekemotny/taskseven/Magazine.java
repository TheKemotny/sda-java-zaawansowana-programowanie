package pl.thekemotny.taskseven;

import java.util.Arrays;
import java.util.Objects;

public class Magazine {
    private final String[] clip;
    
    public Magazine(final int size) {
        this.clip = new String[size];
    }
    
    public int size() {
        return clip.length;
    }
    
    public boolean loadBullet(String bullet) {
        for (int i = 0; i < size(); i++) {
            if(clip[i] == null) {
                clip[i] = bullet;
                return true;
            }
        }
        return false;
    }

    public boolean isLoaded() {
        return Arrays.stream(clip)
                .anyMatch(Objects::nonNull);
    }

    public void shot() {
        for (int i = size() - 1; i >= 0; i--) {
            if(clip[i] != null) {
                System.out.println(clip[i]);
                clip[i] = null;
                return;
            }
        }
        System.out.println("EMPTY CLIP");
    }
}
