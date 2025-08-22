package multithreading.ProducerConsumer;

public class ProducerConsumerLearning {
    public static void main(String[] args) {
        SharedResource sharedBuffer = new SharedResource(3);

        //creating producer thread using lambda expression
        Thread producerThread = new Thread(() -> {
            try {
                for(int i = 1; i <= 6; i++) {
                    sharedBuffer.produce(i);
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        });

        //creating consumer thread using lambda expression
        Thread consumerThread = new Thread(() -> {
            try {
                for(int i = 1; i <= 6; i++) {
                    sharedBuffer.consume();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
