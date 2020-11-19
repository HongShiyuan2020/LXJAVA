package Thread;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Zuoye11_15_2 {
    public static String codeString() {
        char[] a = new char[3];
        int temp;
        for (int i = 0; i < a.length;) {
            temp = (int) (Math.random() * 75 + 48);
            if (temp <= 57 || temp >= 97 || (temp >= 65 && temp <= 90)) {
                a[i] = (char) temp;
                i++;
            }
        }
        return new String(a);
    }

    public static void main(String[] args) {
        String code = codeString();
        List<String> log = new ArrayList<>();
        Thread pojie = new Thread() {
            @Override
            public void run() {
                String trycode;
                OUT: for (int i = 48; i < 123; i++) {
                    for (int j = 48; j < 123; j++) {
                        for (int k = 48; k < 123; k++) {
                            char[] b = new char[3];
                            b[0] = (char) i;
                            b[1] = (char) j;
                            b[2] = (char) k;
                            trycode = new String(b);
                            log.add(trycode);
                            if (trycode.equals(code)) {
                                System.out.println("get " + trycode);
                                break OUT;
                            }
                        }
                    }
                }
                while (!log.isEmpty()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        Thread jilu = new Thread(){
            @Override
            public void run() {
                File out = new File("G:\\out.txt");
                try (FileWriter aFileWriter = new FileWriter(out);){
                    while(true){
                        if(log.isEmpty()){
                            Thread.sleep(1000);
                        }else{
                             System.out.println(log.remove(0));
                                System.out.println(">>"+code);

                        }                   
                    }
                    
                } catch (Exception e) {
                    System.out.println(">>"+code);
                    
                }
            }
        }; 
        pojie.start();
        jilu.setDaemon(true);
        jilu.start();
    }
}
