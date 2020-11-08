package principleHashcode;
import java.util.HashMap;



public class searchInHashMap {
    public static void main(String[] args) {
        //设置HashMap，目标String，初始化；
        HashMap<String,String> testHashMap = new HashMap<>();
        String targeString = "Hero-50000";
        for (int i = 0; i < 2000000; i++) {
            testHashMap.put("Hero-"+i,String.valueOf(i));
        }
        //开始计时；
        long Starttime = System.currentTimeMillis();
        //查找；
        System.out.println(testHashMap.get(targeString));
        //结束计时；
        long endtime = System.currentTimeMillis();
        //输出结果；
        System.out.println("Time:"+(endtime-Starttime)+"ms");
    }
}
