package Thread;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Pool_Test {
    public static void main(String[] args) {
       ThreadPoolExecutor aExecutor = new ThreadPoolExecutor(10, 15, 20, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());

       aExecutor.execute(new Runnable(){
           @Override
           public void run() {
               for (int i = 0; i < 10; i++) {
                    System.out.println("任务"+i);
                }
           }
       });
    }
}
