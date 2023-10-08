package EpamExam;

import java.util.ArrayList;

public class Node {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.remove("ccc");
        arrayList.add("ddd");
        System.out.println(arrayList.get(arrayList.size()));
    }
}
// throw exception
