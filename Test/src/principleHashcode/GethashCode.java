package principleHashcode;



public class GethashCode {

    //生成Hashcode
    public static int getHashCode(String a) {
        int out = 0; 
        for (int i = 0; i < a.length(); i++) {
            out = out+(int)a.charAt(i);
        }
        out = out*23;
        if (out >= 2000) {
            return out%2000;
        }else{
            return out;
        }
    }
    //生成随机字符串
    public static String getRandomSring(){
        
        int length = (int)(Math.random()*9+2);
        char[] a = new char[length];
        String out; 
        for (int i = 0; i < length; ) {
            int k = (int)(Math.random()*75+48);
            if (k <= 57 || (k >= 65 && k <= 90)|| k >= 97 ) {
                a[i] = (char)k;
                i++;
            }
        }
        out = new String(a);
        return out;
    }
    public static void main(String[] args) {
        //初始化字符串数组
        String[] testStrings = new String[10];
        for (int i = 0; i < testStrings.length; i++) {
            testStrings[i] = getRandomSring();
        }        
        //输出原数组
        for (int i = 0; i < testStrings.length; i++) {
            System.out.print(testStrings[i]+"\t");            
        }

        System.out.println();
        //输出Hashcode
        for (int i = 0; i < testStrings.length; i++) {
            System.out.print(getHashCode(testStrings[i])+"\t");
        }
    }
}
