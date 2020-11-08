package principleHashcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class searchInList {
    public static void main(String[] args) {
        //创建List和目标String
        List<String> testList = new ArrayList<>();
        String targeString = "Hero-50000";
        //初始化List
        for (int i = 0; i < 2000000; i++) {
            testList.add("Hero-"+i);
        }
        //混淆List
        Collections.shuffle(testList);
        //开始计时
        long startTime = System.currentTimeMillis();
        //查找过程
        for (String string : testList) {
            if (string.equals(targeString)) {
                System.out.println("Get It!");
                break;
            }
        }
        //结束计时
        long endTime = System.currentTimeMillis();
        //输出时间
        System.out.println("Time:"+(endTime-startTime)+"ms");

    }
}
