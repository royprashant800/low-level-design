package multithreading;

import java.util.concurrent.*;

public class ScheduledThreadPoolExecutor {
    public static void main(String[] args) {
        //ExecutorService poolObject = Executors.newFixedThreadPool(5);

        //case1 - task submission after shutdown
        // poolObject.submit(() -> {
        //     System.out.println("Thread going to start its work");
        // });

        // poolObject.shutdown();

        // poolObject.submit(() -> {
        //     System.out.println("Thread going to start its work");
        // });

        //case1 - shutdown don't impact the already submitted task 
        // poolObject.submit(() -> {
        //     try {
        //         Thread.sleep(5000);
        //     } catch (Exception e) {
        //         // handle exception
        //     }
        //     System.out.println("New task");
        // });

        // poolObject.shutdown();
        // System.err.println("main thread unblocked and finished processing");

        // case3 - Usage of awaitTermination
        // poolObject.submit(() -> {
        //     try {
        //         Thread.sleep(6000);
        //     } catch (Exception e) {
        //         // handle exception
        //     }
        //     System.out.println("new task");
        // });

        // poolObject.shutdown();
        // try {
        //     boolean isExecutorTerminated = poolObject.awaitTermination(3, TimeUnit.SECONDS);
        //     System.out.println("Main thread, isExecutorTerminated: " + isExecutorTerminated);
        // } catch (Exception e) {
        //     //  handle exception
        // }

        // case4 - Schedule at fixed rate
        ScheduledExecutorService scheduledExecutorObj = new java.util.concurrent.ScheduledThreadPoolExecutor(15);
        Future<?> scheduledObj = scheduledExecutorObj.scheduleAtFixedRate(() -> {
            System.out.println("task going to start by : " + Thread.currentThread().getName());

            try {
                Thread.sleep(8000);
            } catch (Exception e) {
                // handle exception
            }
            System.out.println("New task");
        }, 5, 5, TimeUnit.SECONDS);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduledObj.cancel(true);
    }
}
