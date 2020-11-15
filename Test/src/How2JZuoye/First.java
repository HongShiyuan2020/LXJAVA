package How2JZuoye;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        File aFile = new File("G:\\Projects\\output.txt");

        try(FileOutputStream aFileOutputStream = new FileOutputStream(aFile);

        ) {
            String b  = new String();
            Scanner in = new Scanner(System.in);
            b = in.nextLine();
            byte[] a = b.getBytes();
            aFileOutputStream.write(a);
            in.close();
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
