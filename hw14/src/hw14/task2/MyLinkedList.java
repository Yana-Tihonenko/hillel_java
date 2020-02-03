package hw14.task2;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E> {
    int size = 0;
    MyNode<E> first;
    MyNode<E> last;

    public MyLinkedList() {
    }

    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }

    public MyLinkedList(List<? extends E> c) {
        addElementFromList(c);
    }

    private void addElementFromList(List<? extends E> c) {
        Object[] a = c.toArray();
        MyNode<E> pred, newNode = null;
        for (Object o : a) {
            newNode = new MyNode<E>((E) o, null);
            pred = newNode;
            if (first == null) {
                first = newNode;
                last = newNode;
            } else {
                pred.next = newNode;
                last = newNode;
                size++;
            }
        }
    }

    public void addFirst(E element) {
        if (getSize() == 0)
            add(element);
        else {
            MyNode<E> f = first;
            MyNode<E> newNode = new MyNode<E>(element, f);
            first = newNode;
            size++;
        }
    }

    public void addLast(E element) {
        if (getSize() == 0)
            add(element);
        else {
            MyNode<E> f = last;
            MyNode<E> newNode = new MyNode<E>(element, null);
            f.next = newNode;
            last = newNode;
            size++;
        }
    }

    public void addToIndex(int index, E element) throws IndexOutOfBoundsException {

        if (checkIndexValid(index, 1) == false)
            throw new IndexOutOfBoundsException("Invalid index");
        if (getSize() == 0)
            add(element);
        else {
            MyNode<E> x = first;
            MyNode<E> prev = null;
            for (int i = 1; i != index; i++) {
                prev = x;
                x = x.next;
            }
            MyNode<E> newNode = new MyNode<E>(element, x);
            prev.next = newNode;
            size++;
        }
    }

    private void add(E element) {
        MyNode<E> newNode = new MyNode<E>(element, null);
        first = newNode;
        last = newNode;
        size++;
    }

    public void removeFirst() throws NoSuchElementException {

        if (getSize() == 0)
            throw new NoSuchElementException("List is empty");
        if (getSize() == 1)
            removeAll();
        if (getSize() > 1) {
            MyNode<E> x = first;
            first = x.next;
            x.next = null;
            size--;
        }
    }

    public void removeLast() throws NoSuchElementException {
        MyNode<E> prev = null;
        if (size == 0)
            throw new NoSuchElementException("List is empty");
        if (getSize() == 1)
            removeAll();
        if (getSize() > 1) {
            MyNode<E> y = last;
            for (MyNode x = first; x.next == y; ) {
                prev = x;
                x = x.next;
            }
            last = prev;
            prev.next = null;
            size--;
        }
    }

    public void removeToIndex(int index) throws IndexOutOfBoundsException {
        if (checkIndexValid(index, 0) == false)
            throw new IndexOutOfBoundsException("Invalid idex");
        if (getSize() == 1)
            removeAll();
        if (index == getSize())
            removeLast();
        else {
            MyNode<E> current = first;
            MyNode<E> prev = null;
            MyNode<E> nex = null;
            for (int i = 1; i != index; i++) {
                prev = current;
                current = current.next;
                nex = current.next;
            }
            prev.next = nex;
            current.next = null;
            size--;

        }
    }

    private void removeAll() {
        MyNode<E> x = first;
        x.next = null;
        first = null;
        last = null;
        size = 0;
    }

    public void replaceElement(int index1, int index2) throws IndexOutOfBoundsException {

        if (checkIndexValid(index1, 0) == false || checkIndexValid(index1, 0) == false)
            throw new IndexOutOfBoundsException("Invalid index");
        if (index1 == index2)
            throw new IndexOutOfBoundsException("Invalid index");
        if (getSize() == 2) {
            MyNode<E> firstElement = first;
            MyNode<E> lastElement = last;
            first = lastElement;
            last = firstElement;
            lastElement.next = firstElement;
            firstElement.next = null;
        } else {
            MyNode<E> currentIndex1 = first;
            MyNode<E> prevIndex1 = null;
            MyNode<E> nexIndex1 = null;
            for (int i = 1; i != index1; i++) {
                prevIndex1 = currentIndex1;
                currentIndex1 = currentIndex1.next;
                nexIndex1 = currentIndex1.next;
            }
            MyNode<E> currentIndex2 = first;
            MyNode<E> prevIndex2 = null;
            MyNode<E> nexIndex2 = null;
            for (int j = 1; j != index2; j++) {
                prevIndex2 = currentIndex2;
                currentIndex2 = currentIndex2.next;
                nexIndex2 = currentIndex2.next;
            }
            prevIndex1.next = currentIndex2;
            currentIndex2.next = nexIndex1;
            currentIndex1.next = nexIndex2;
            prevIndex2.next = currentIndex1;
        }
    }

    public void toPrint() {
        if (size > 0) {
            MyNode<E> x = first;
            for (int i = 1; i <= size; i++) {
                Object data = x.element;
                System.out.println(data.toString());
                x = x.next;
            }
        } else
            System.out.println("List is empty");
    }

    public int getSize() {
        return size;
    }

    public boolean checkIndexValid(int index, int operationType) {
        if (operationType == 1) {
            if ((index > 0 && index <= size) || (index == 1 && size == 0))
                return true;
            else
                return false;
        }
        if (operationType == 0) {
            if (index > 0 && index <= size)
                return true;
            else
                return false;
        }
        return false;
    }

    public boolean isEmpty() {
        if (size == 0 && first == null && last == null)
            return true;
        else
            return false;
    }


    private class MyLinkedListIterator implements Iterator<E> {
        private MyNode curr;

        public MyLinkedListIterator() {
            this.curr = MyLinkedList.this.first;
        }

        @Override
        public boolean hasNext() {
            return this.curr != null;
        }

        @Override
        public E next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            E value = (E) curr.element;
            curr = curr.next;
            return value;
        }
    }
}

class MyNode<E> {
    E element;
    MyNode<E> next;

    public MyNode(E element, MyNode<E> next) {
        this.element = element;
        this.next = next;
    }
}

