package multithreading.ProducerConsumer;

import java.util.*;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int size) {
        sharedBuffer = new LinkedList<>();
        bufferSize = size;
    }

    public synchronized void produce(int item) throws Exception {
        //if buffer is full, wait for the consumer to comsume items
        while(sharedBuffer.size() == bufferSize) {
            System.out.println("buffer is full producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("produced : " + item);
        //Notify the consumer that there are items to consume now
        notify();
    }

    public synchronized int consume() throws Exception {
        //Buffer is empty, wait for the producer to produce items
        while(sharedBuffer.isEmpty()) {
            System.out.println("Buffer is empty, consumer is waiting for producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("consumed : " + item);
        // Notify the producer that there is space in buffer now
        notify();
        return item;
    }
}
