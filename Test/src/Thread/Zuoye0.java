package Thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Zuoye0 {
    public static void main(String[] args) {
        File aFile = new File("G:\\Projects");
        Find(aFile,"SUperThread");

    }

    public static void Find(File aFile,String s) {

        File[] files = aFile.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                Find(file,s);
            } else if (file.getName().endsWith(".java")) {
                Thread aThread = new Thread() {
                    @Override
                    public void run() {
                        try(FileReader aFileReader = new FileReader(file);
                        BufferedReader aBufferedReader = new BufferedReader(aFileReader);) {
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
                };
                aThread.start();
                System.out.println(file.getName());
            }
        }
    }
}
