package multithreading;

import java.util.*;
import java.util.concurrent.*;

public class FutureCompletableFutureAndCallable {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        // poolExecutor.submit(() -> {
        //     System.out.println("This is the task which thread will execute");
        // });

        //FUTURE
        // Future<?> futureObj = poolExecutor.submit(() -> {
        //     System.out.println("This is the task which thread will execute");
        // });
        // System.out.println(futureObj.isDone());

        // Future<?> futureObj = poolExecutor.submit(() -> {
        //     try {
        //         Thread.sleep(7000);
        //         System.out.println("This is the task which thread will execute");
        //     } catch (Exception e) {
        //         //handle exception
        //     }
        // });

        // System.out.println("is done: " + futureObj.isDone());
        // try {
        //     futureObj.get(2, TimeUnit.SECONDS);
        // } catch (TimeoutException e) {
        //     System.out.println("timeout exception");
        // } 
        // catch(Exception e) {
        //     //
        // }

        // try {
        //     futureObj.get();
        // } catch (Exception e) {
        //     // handle exception
        // }

        // System.out.println("isDOne: " + futureObj.isDone());
        // System.out.println("is cancelled: " + futureObj.isCancelled());

        //CALLABLE
        // use case1
        Future<?> futureObj1 = poolExecutor.submit(() -> {
            System.out.println("Task1 with runnable");
        });

        try {
            Object object = futureObj1.get();
            System.out.println(object == null);
        } catch (Exception e) {
            //  handle exception
        }
        // use case2
        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> futureObj2 = poolExecutor.submit(() -> {
            output.add(100);
            System.out.println("Task2 with runnable and return object");
        }, output);

        try {
            List<Integer> outputFromFutureObj2 = futureObj2.get();
            System.out.println(outputFromFutureObj2.get(0));
        } catch (Exception e) {
            //  handle exception
        }

        //Use case3
        Future<List<Integer>> futureObj3 = poolExecutor.submit(() -> {
            System.out.println("task3 with callable");
            List<Integer> listObj = new ArrayList<>();
            listObj.add(200);
            return listObj;
        });

        try {
            List<Integer> outputFromFutureObj3 = futureObj3.get();
            System.out.println(outputFromFutureObj3.get(0));
        } catch (Exception e) {
            // handle exception
        }
    }
}
