package HashMapAndHanshTable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapAndTable {
    public static void reverse(HashMap<String,String> a) {
        //创建输出HashMap，中间Collection，中间Set
        HashMap<String,String> out = new HashMap<>();
        Collection<String> interValue = a.values();
        Set<String> interKey = a.keySet();
        //输出原key与value
        System.out.println(interValue);
        System.out.println(interKey);
        //创建迭代器
        Iterator<String> aIterator = interKey.iterator();
        Iterator<String> bIterator = interValue.iterator();
        //交换过程
        while (aIterator.hasNext()) {
            out.put(bIterator.next().toString(), aIterator.next().toString());
        }
        //输出结果
        System.out.println(out);
    }

    public static void main(String[] args) {
        HashMap<String, String> mapTest = new HashMap<>();
        //初始化
        mapTest.put("apc","A");
        mapTest.put("adc","B");
        mapTest.put("t","C");
        //反转
        reverse(mapTest);
    }
}
