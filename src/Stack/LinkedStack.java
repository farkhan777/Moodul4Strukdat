package Stack;

public class LinkedStack<E> implements Stack<E> {
    private SinglyLinkedList<E> stack = new SinglyLinkedList<E>();
    // cunstroctor
    public LinkedStack(){

    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void push(E element){
        stack.addFirst(element);
    }

    public E pop(){
        return stack.removeFirst();
    }

    public E top(){
        return stack.first();
    }
}
