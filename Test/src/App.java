import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 213414;
        String aString = Integer.toString(a);
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < aString.length(); i++) {
            arrayList.add(aString.charAt(i));
        }
        StringBuffer aBuffer = new StringBuffer();
        int an = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            aBuffer.append(arrayList.size()-1-i);
            an++;
            if(an%3 == 0){
                aBuffer.append(".");
                an =0;
            }
        }
        aBuffer.deleteCharAt(aBuffer.length()-1);
        aBuffer.reverse().toString();
        System.out.println(aBuffer);
    }
}
