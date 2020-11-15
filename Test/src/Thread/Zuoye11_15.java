package Thread;

import java.util.Scanner;

import compareor.Hero;

public class Zuoye11_15 {
    public static void main(String[] args) {
        Hero aHero = new Hero(1000, 2333, "Temo");

        Thread aThread = new Thread(){
            @Override
            public void run() {
                int k = 0;
                Scanner in = new Scanner(System.in);
                char hit = in.nextLine().charAt(0);
                while (hit == 'A'|| hit == 'a') {
                    try 
                    {
                        if(k%3==0 && k!=0){
                            System.out.println("colding...");
                            Thread.sleep(5000);
                            System.out.println("attack!");
                            k++;
                        }else{
                            Thread.sleep(1000);
                            System.out.println("attack!");
                            k++;
                        }
                    } catch (Exception e) {
                    }
                    hit = in.nextLine().charAt(0);
                }
                k = 0;
                in.close();
            }
        };
        aThread.start();
    }
}
