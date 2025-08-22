package multithreading.forkJoin_ETC;

import java.util.concurrent.*;

public class ForkJoin_ETC {
    public static void main(String[] args) {
        //Fixed threadpool executor
        // ExecutorService poolExecutor1 = Executors.newFixedThreadPool(5);
        // poolExecutor1.submit(() -> "this is the async task");

        //cached threadpool executor
        // ExecutorService poolExecutor2 = Executors.newCachedThreadPool();
        // poolExecutor2.submit(() -> "this is the async task");

        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> futureObj = pool.submit(new ComputeSumTask(0, 100));

        try {
            System.out.println(futureObj.get());
        } catch (Exception e) {
            // handle exception
        }
    }
}
