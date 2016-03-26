package Lesson_4_2_1;

import java.util.Iterator;

/**
 * Created by 777 on 24.03.2016.
 */
public class SimpleLinkedList implements Iterable<Object>{
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
        if(root==null && root.node==null){
            System.out.println("List is empty.");
            return;
        }
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

    public void printList(){
        Node n = root;int i=0;
        System.out.print("{ ");
        for (;;){
            if(i==size){
                System.out.println("}");
                return;
            }
            System.out.print(n.o.toString()+" ");
            n = n.node;
            i++;
        }
    }

    public int getSize() {
        return size;
    }

    public Iterator<Object> iterator(){
        return new SLLIterator();
    }


    private class Node {
        private Object o;
        private Node node;
    }

    private class SLLIterator implements Iterator<Object>{
        Node n;

        public SLLIterator(){}

        @Override
        public Object next() {
            if(n==null && root!=null){
                n=root;
                return n.o;
            }
            if(hasNext()){
                 n = n.node;
                return n.o;
            }
            throw new IllegalStateException("That was the last element in current list.");
        }

        @Override
        public boolean hasNext() {
            return (n!=null && n.node!=null);
        }
    }
}
