package junit;

import java.util.List;

public class ListManager {

    // add element to list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // remove element from list
    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    // get size of list
    public int getSize(List<Integer> list) {
        return list.size();
    }
}
