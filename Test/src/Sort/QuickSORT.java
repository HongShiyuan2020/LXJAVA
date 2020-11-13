package Sort;

import java.util.Arrays;

public class QuickSORT {

    //快速排序
    public static void quickSort(int a[],int beg,int end) {
        if(end-beg <= 0){
            return;
        }else{
            int L = beg,R = end;
            int port = a[beg];
            for (;L!=R;) {
                for (;port < a[R]&&L<R; ) {
                    R--;
                }
                a[L] = a[R];
                for (;a[L] < port&&L<R; ) {
                    L++;
                }
                a[R] = a[L];                
            }
            int index = R;
            a[index] = port;
            quickSort(a, beg, index-1);
            quickSort(a, index+1,end);
            
        }
    }
     public static void main(String[] args) {
        int a[] = new int[60];
       
        // Arrays.stream(a)
            // .forEach(h->System.out.print(h+" "));
             long sum = 0;
        // for (int i = 0; i < 50; i++) {
            for (int j = 0; j < a.length; j++) {
                a[j] = (int)(Math.random()*10000);
            }
            long sa = System.currentTimeMillis();
            quickSort(a,0,a.length-1);
            long se = System.currentTimeMillis();
            sum += se-sa;            
        // }
    
        System.out.println();
        Arrays.stream(a)
            .forEach(h->System.out.print(h+" "));
        System.out.println("\n"+(1.00*sum/1)+"ms");
    }
}
