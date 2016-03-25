package Lesson_4_2_1;

/**
 * Created by 777 on 24.03.2016.
 */
public class SimpleLinkedList {
    private Node root;
    private int size;

    public SimpleLinkedList(){
        size = 0;

    }

    public void addFirst(Object object){
            Node node = new Node();
            node.o = object;
            node.node = this.root;
            this.root = node;
            size++;
        }

    public void addLast(Object object){

    }

    public void addAfter(Object object1, Object object2){

    }

    public int getSize() {
        return size;
    }

    private class Node {
        private Object o;
        private Node node;
    }
}
