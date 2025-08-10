package multithreading.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    AtomicInteger counter = new AtomicInteger(0);
    // SharedResource(int counter) {
    //     this.counter = counter;
    // }

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get()    ;
    }
}
