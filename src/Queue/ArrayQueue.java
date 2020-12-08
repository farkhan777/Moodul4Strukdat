package Queue;

public class ArrayQueue<T> implements Queue<T>{
    private T[] data;
    private int front = 0;
    private int size = 0;

    public ArrayQueue(){
        this(10);
    }

    public ArrayQueue(int capacity){
        data = (T[]) new Object[capacity];
    }

    @Override
    public int size() {
        // Auto generate method sub
        return size;
    }

    @Override
    public boolean isEmpty() {
        // Auto generate method sub
        return (size == 0);
    }

    @Override
    public void enqueue(T element) throws IllegalStateException{
        // jika Queue penuh maka tampilkan pesan error
        if (size == data.length)
            throw new IllegalStateException("Queue is full");

        // jika Queue belum penuh
        // tentukan posisi untuk memasukkan element baru ke dalam array
        int pos = (front + size) % data.length;
        data[pos] = element;
        size++;
    }

    @Override
    public T dequeue() {
        // cek apakah Queue kosong
        if (isEmpty())
            return null;
        T deleted = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return deleted;
    }

    @Override
    public T peek() {
        // cek apakah Queue kosong
        if (isEmpty())
            return null;

        return data[front];
    }
}
