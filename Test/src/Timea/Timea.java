package Timea;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timea {
    public static void main(String[] args) {
        Date aDate = new Date();

        SimpleDateFormat aDateFormat = new SimpleDateFormat("hh:mm:ss");
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(aDateFormat.format(System.currentTimeMillis()));
                    if(System.currentTimeMillis()-aDate.getTime() >= 10000){break;}
                    System.out.print("\r");
                }
            }
        };
        
        thread.run();
    }
}
