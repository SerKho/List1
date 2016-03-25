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
            if(root != null){
                node.node = root;
            }
            root = node;
            size++;
        }

    public void addLast(Object object){
        if(root == null){
            addFirst(object);
        }
        else{
            Node n=root;
            while (n.node!=null){
                n=n.node;
            }
            Node node = new Node();
            node.o = object;
            n.node = node;
            size++;
        }


    }

    public void addAfter(Object object1, Object object2){
        Node n = new Node();
        n.o = object2;
        Node n1 = root;int i = 0;
        while (!(n1.o.equals(object1))){
            i++;
            if(i>=size){
                throw new IllegalStateException("Needed object wasn't found.");
            }
            n1 = n1.node;
        }
        n.node = n1.node;
        n1.node = n;
        size++;
    }

    public int getSize() {
        return size;
    }

    private class Node {
        private Object o;
        private Node node;
    }
}
