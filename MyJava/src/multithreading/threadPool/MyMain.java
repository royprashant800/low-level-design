import java.util.concurrent.*;

public class MyMain {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,5, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10), new CustomThreadFactor(), new CustomRejecthandler());

        poolExecutor.allowCoreThreadTimeOut(true);

        //task
        for(int i = 0; i < 25; i++) {
            poolExecutor.submit(() -> {
                try {
                    Thread.sleep(5000);
                    System.out.println("Thread name: " + Thread.currentThread().getName());
                } catch (Exception e) {
                    // handle exception
                }
            });
        }
    }
}
