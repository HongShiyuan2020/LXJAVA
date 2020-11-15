package How2JZuoye;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;



public class Second_Jiema_Jiami {
    public static void Jiami(File f, int key,File des) {
        try (
            FileReader aFileReader = new FileReader(f);
            FileWriter aFileWriter = new FileWriter(des);
        ){
            char[] chars = new char[(int)f.length()];
            aFileReader.read(chars);
            for (int i = 0; i < chars.length; i++) {
                if((chars[i]>='A' && chars[i] <= 'Z')||(chars[i] <= 'z' && chars[i] >= 'a')){
                    chars[i] = (char)(chars[i]+key); 
                }
            }
            aFileWriter.write(chars);
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Jiemi(File f,int key) {
        
    }
    public static void main(String[] args) {
        File aFile = new File("G:\\Projects\\output.txt");
        Jiami(aFile, 5,new File("G:\\Projects\\a.txt"));
        
        JFrame aFrame = new JFrame();
        aFrame.setVisible(true);
        aFrame.setSize(900, 500);
        aFrame.setResizable(false);
        
    }
}
