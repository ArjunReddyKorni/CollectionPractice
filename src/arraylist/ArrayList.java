package arraylist;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        List<Integer> list = new java.util.ArrayList<>();

        list.add(100);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        list.add(24);
        list.add(45);
        System.out.println("list.contains(23) = " + list.contains(23));
        System.out.println("list.indexOf(\"25\") = " + list.indexOf("25"));
        System.out.println("list.indexOf(24) = " + list.indexOf(24));
        System.out.println("list.size() = " + list.size());
        list.add(2,23);
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);

        System.out.println("list.hashCode() = " + list.hashCode());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        list.set(1,234);
        System.out.println("list.remove(234) = " + list.remove(2));
        list.clear();
        System.out.println("list = " + list);
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.lastIndexOf(24) = " + list.lastIndexOf(24));



    }
}
