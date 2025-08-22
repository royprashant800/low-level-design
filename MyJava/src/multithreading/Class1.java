package multithreading;

public class Class1 {
    public  void task1() {
        try {
            System.out.println("Inside task1");
            Thread.sleep(5000);
        } catch(Exception e) {
            //
        }
    }
    public  void task2() {
        System.out.println("Inside task2, before sync");
        synchronized(this) {
            System.out.println("task2, inside sync");
        }
    }
    public  void task3() {
        System.out.println("Inside task3");
    }
}
