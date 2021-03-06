import java.util.*;

public class MyLinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int currentSize;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.currentSize = 0;
    }

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return this.data;
        }

        public void setData(T newData) {
            this.data = newData;
        }

        public Node<T> getNext() {
            return this.next;
        }

        public void setNext (Node<T> newNext) {
            this.next = newNext;
        }
    }

    class LinkedListIterator implements Iterator<E> {
        private Node<E> current;
        private Node<E> previous1;
        private Node<E> previous2;

        private boolean removeCalled; //for tracking remove method right invocation


        public LinkedListIterator() {
            current = head;
            previous1 = null;
            previous2 = null;
            removeCalled = false;
        }

        public boolean hasNext() {
            return current != null;
        }

        public E next() {
            if (current == null) {
                throw new NoSuchElementException();
            }
            E temp = current.getData();
            previous2 = previous1;
            previous1 = current;
            current = current.getNext();
            removeCalled = false; //for tracking remove method right invocation
            return temp;
        }

        public void remove() {
            if (previous1 == null || removeCalled) {
                throw new IllegalStateException();
            }

            if (previous2 == null) {
                head = current; // remove called once
            } else {
                previous2.setNext(current); // prev2 --> X prev1 --> current
                previous1 = previous2;
            }
            currentSize--;
            removeCalled = true; //for tracking remove method right invocation
        }
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int size() {
        return this.currentSize;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean add(E e) {
        if(isEmpty()) {
            head = new Node(e, null);
            tail = head;
        } else {
            tail.setNext(new Node(e, null));
            tail = tail.getNext();
        }
        currentSize++;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {
        head = null;
        tail = null;
        currentSize = 0;
    }

    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index < size() - 1) {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getData();
        }

        return tail.getData();
    }

    public E set(int index, E element) {
        return null;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == size()) {
            add(element);
            return;
        }

        if (index == 0) {
            head = new Node(element, head);
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }

            current.setNext(new Node(element, current.getNext()));
        }
        currentSize++;
    }

    public E remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<E> listIterator() {
        return null;
    }

    public ListIterator<E> listIterator(int index) {
        return null;
    }

    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
