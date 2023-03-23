package pl.thekemotny.taskstwentytotwentynine.tasktwentyeight;

import java.util.ArrayList;
import java.util.List;

public class TaskTwentyEight<E> extends ArrayList<E> {
    public List<E> getEveryNthElement(final int startIndex, final int skip) {
        List<E> list = new ArrayList<>();
        int currentIndex = startIndex;
        while(currentIndex <= size()) {
            list.add(get(currentIndex));
            currentIndex += skip;
        }
        return list;
    }

}
