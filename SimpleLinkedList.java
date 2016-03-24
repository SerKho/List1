package Lesson_4_2_1;

/**
 * Created by 777 on 24.03.2016.
 */
public class SimpleLinkedList {
    private Node root;
    private int size;

    public SimpleLinkedList(){

    }

    public void addFirst(Object object){

    }

    public void addLast(Object object){

    }

    public void addAfter(Object object1, Object object2){

    }

    public int getSize() {
        return size;
    }

    public class Node {
        private Object o;
        private Node node;

        public Node(){}

        public Object getO() {
            return o;
        }

        public void setO(Object o) {
            this.o = o;
        }

        public Node getNode() {
            return node;
        }

        public void setNode(Node node) {
            this.node = node;
        }
    }
}
