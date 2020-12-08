package Queue;

public class Driver {
    public static void main(String[] args) {
        ArrayQueue<String> name = new ArrayQueue<String>();

        name.enqueue("Bambang");
        name.enqueue("Ucup");
        System.out.println("Isi Queue: "+name.size());
        System.out.println("Element Terdepan Pada Queue: "+name.peek());

        System.out.println("<------------------->");
        name.dequeue();
        name.dequeue();
        System.out.println("Queue Kosong: "+name.isEmpty());
        System.out.println("Isi Queue: "+name.size());

        System.out.println("<   ------------------->");
        name.enqueue("Farkhan");
        System.out.println("Isi Queue: "+name.size());
        System.out.println("Queue Kosong: "+name.isEmpty());
        System.out.println("Element Terdepan Pada Queue: "+name.peek());

    }
}
