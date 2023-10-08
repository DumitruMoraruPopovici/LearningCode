package Codebat;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EpamSecondArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(-2);
        list.add(1);
        list.add(-1);
        ListIterator<Integer> iterator = list.listIterator(1);
        for (int i=0; i < list.size();i++) {
            Integer obj = iterator.next();
            iterator.remove();
            System.out.println(obj + " ");
        }
    }
}
