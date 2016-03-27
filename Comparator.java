package Lesson_4_2_1;

/**
 * Created by 777 on 27.03.2016.
 */
public class Comparator implements java.util.Comparator{


    Comparator(){
    }

    @Override
    public int compare(Object o1, Object o2) {

        String s1 = o1.toString();
        String s2 = o2.toString();
        return -1*(s1.compareTo(s2));
    }
}
