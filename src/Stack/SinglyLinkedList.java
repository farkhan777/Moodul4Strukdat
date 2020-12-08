package Stack;

public class SinglyLinkedList<E> {
    Node<E> head = null;
    Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList(){

    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public E first(){
        if (isEmpty())
            return null;
        return tail.getElement();
    }
    public void addFirst(E e){
        head = new Node<E>(e, head);
        if (size == 0)
            tail = head;
        size++;
    }
    public void addLast(E e){
        Node<E> newNode = new Node<>(e, null);
        if (isEmpty()){
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }
    public E removeFirst(){
        if (isEmpty())
            return null;
        E deleted = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0){
            tail = null;
        }
        return deleted;
    }
    public E removeLast(){
        Node<E> temp = head;
        Node<E> deleted = head;
        if (isEmpty())
            return null;
        while (deleted.getNext() != null){
            temp = deleted;
            deleted = deleted.getNext();
        }
        if (deleted == head){
            head = null;
        } else {
            temp.setNext(null);
        }
        return deleted.getElement();
    }
    public E removeN (int n){
        Node<E> temp = head;
        Node<E> deleted;
        int i = 1;
        if (n > size){
            return null;
        } else {
            while (i < n-1){
                temp = temp.getNext();
                i++;
            }
            deleted = temp.getNext();
            temp.setNext(deleted.getNext());
            return deleted.getElement();
        }
    }
    public E getElementN(int n){
        Node<E> temp = head;
        int i;
        if (n > size){
            return null;
        } else {
            for (i=1; i<n; i++){
                temp = temp.getNext();
            }
            return temp.getElement();
        }
    }
    public void disply() {
        if (head == null) {
            System.out.println("Empty!");
            return;
        }

        if (head.getNext() == null) {
            System.out.println(head.getElement());
            return;
        }

        Node<E> ptr = head;
        System.out.print(ptr.getElement() + " ");
        ptr = head.getNext();
        while (ptr.getNext() != null) {
            System.out.print(ptr.getElement() + " ");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getElement() + "\n");
    }
}
