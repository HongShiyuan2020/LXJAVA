package Thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Zuoye0 {
    public static void main(String[] args) {
        File aFile = new File("G:\\Projects");
        Find(aFile,"SUperThread");

    }

//查找文件
    public static void Find(File aFile,String s) {
        ThreadPoolExecutor aExecutor = new ThreadPoolExecutor(10, 15, 20, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        File[] files = aFile.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                Find(file,s);
            } else if (file.getName().endsWith(".java")) {
          //找到.java扔进线程池           
                aExecutor.execute(new Runnable(){
                    @Override
                    public void run() {
                        try(FileReader aFileReader = new FileReader(file);
                        BufferedReader aBufferedReader = new BufferedReader(aFileReader);) {
                            //逐行读取数据直到读取到目标数据
                            while (true) {
                                String astr = aBufferedReader.readLine();
                                
                                if(null == astr){
                                    break;
                                }
                                if (astr.contains(s)) {
                                    System.out.println("finded "+"at "+file.toPath());break;
                                }
                            }
                        } catch (Exception e) {
                            
                            e.printStackTrace();
                        }
                    }
                });
                //线程池结束
                System.out.println(file.getName());
            }
        }
    }
}
