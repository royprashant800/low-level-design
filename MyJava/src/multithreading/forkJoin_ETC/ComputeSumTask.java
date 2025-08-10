package multithreading.forkJoin_ETC;

import java.util.concurrent.*;

public class ComputeSumTask extends RecursiveTask<Integer> {
    int start;
        int end;
        ComputeSumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        protected Integer compute() {
            if(end - start <= 4) {
                int totalSum = 0;
                for(int i = start; i <= end; i++) {
                    totalSum += i;
                }
                return totalSum;
            } else {
                //split the task
                int mid = (start + end) / 2;
                ComputeSumTask lefTask = new ComputeSumTask(start, mid);
                ComputeSumTask righTask = new ComputeSumTask(mid + 1, end);

                //Fork the subtasks for parallel exedcution
                lefTask.fork();
                righTask.fork();

                //Combine the result of subtasks
                int leftResult = lefTask.join();
                int rightResult = righTask.join();

                //combine the result
                return leftResult + rightResult;
            }
        }
}
