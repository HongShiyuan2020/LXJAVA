package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Synchornized {
    
    Date a = new Date();
    SimpleDateFormat aDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:SSS");
    public void put(int k) {
        if (k == 1) {
            System.out.println(aDateFormat.format(a));                 
        }else{
            System.out.println(" "+aDateFormat.format(a));                 
        }
    }

    public static void main(String[] args) {
        Synchornized ak = new Synchornized();
        
        Thread t1 = new Thread(){
            @Override
            public void run() {
                // synchronized (a){
                    for (int i = 0; i<10; i++) {
                        
                        ak.put(1);
                        
                    }
                // }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run() {
                // synchronized (a){
                    for (int i = 0; i<10; i++) {
                        
                        ak.put(2);
                        
                    }
                // }
            }
        };
        t2.start();
    }
}
