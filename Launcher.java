package Lesson_4_2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 777 on 25.03.2016.
 */
public class Launcher {
    public static void main(String[] args) {
//        System.out.println("Test1");
//        SimpleLinkedList s = new SimpleLinkedList();
//        s.addFirst("T1");
//        s.addFirst("T2");
//        s.addFirst("T3");
//        s.printList();
//
//        for(Iterator<Object> it = s.iterator();it.hasNext();){
//            Object o = it.next();
//
//            System.out.println(o);
//        }
//
//        s.remove("T1");
//        System.out.println(s.getSize());
//        s.printList();

        List<String> l = new ArrayList<>();

        l.add("Andrey");
        l.add("andre");
        l.add("Bill");
        l.add("Cevin");
        l.add("Dave");
        l.add("Eric");
        l.add("Eduard");
        l.add("Evan");
        l.add("Ben");
        l.add("Bredly");
        l.add("Zuck");
        l.add("Andre");

        Collections.sort(l, new Comparator());
        Object[] res = new String[l.size()];
        res = l.toArray();
        for(Object o:res){
            System.out.println(o);
        }

//
//        for (Object o:s){
//            String a = (String)o;
//            System.out.println(o);
//        }

//        System.out.println("");
//        System.out.println("Test2");
//        String m = new String("mark");
//        s.addLast(m);
//        s.addLast("T0");
//        s.printList();
//        System.out.println(s.getSize());
//
//        System.out.println("");
//        System.out.println("Test3");
//        String m1 = new String("middle");
//        s.addAfter(m, m1);
//        s.addAfter(m, "middle(-1)");
//        s.printList();
//        System.out.println(s.getSize());
//
//        System.out.println("");
//        System.out.println("Test4");
//        s = new SimpleLinkedList();
//        s.addLast(m);
//        s.addAfter(m, "last");
//        s.printList();
//        System.out.println(s.getSize());
//
//        System.out.println("");
//        System.out.println("Test5");
//        s = new SimpleLinkedList();
//        s.addLast(m);
//        s.addAfter("last","next");
//        s.printList();
//        System.out.println(s.getSize());


    }
}
