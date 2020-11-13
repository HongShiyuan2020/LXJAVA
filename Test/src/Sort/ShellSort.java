package Sort;

import java.util.Arrays;

public class ShellSort {
    public static void shellSort(int a[]) {
        for (int gap = a.length%2==0 ? a.length/2:(a.length-1)/2; gap > 0; gap = gap%2==0 ? gap/2:(gap-1)/2) {
            for (int i = gap; i < a.length; i++) {
                int ss = i;
                for (int j = i-gap; j>=0; j -= gap ) {
                    if (a[ss] < a[j]) {
                        a[ss] = a[ss]+a[j];
                        a[j] = a[ss]-a[j];
                        a[ss] = a[ss]-a[j];
                        ss = j;
                    }else{
                        break;
                    }
                }
            }            
        }
    }
    public static void main(String[] args) {
        int a[] = new int[100000];
      
        Arrays.stream(a)
            .forEach(h->System.out.print(h+" "));
            long sum = 0;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < a.length; j++) {
                a[j] = (int)(Math.random()*1000);
            }
            long sa = System.currentTimeMillis();
            shellSort(a);
            long se = System.currentTimeMillis();
            sum += se-sa;            
        }
    
        System.out.println();
        Arrays.stream(a)
            .forEach(h->System.out.print(h+" "));
        System.out.println("\n"+(1.00*sum/50)+"ms");
    }
}
