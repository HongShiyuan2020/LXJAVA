package principleHashcode;

import java.util.LinkedList;

public class CustoHashMap implements IHashMap{
    //存储空间
    LinkedList<Entry>[] saveSpace = new LinkedList[2000];


    @Override
    public void put(String key, Object object) {
        int location = GethashCode.getHashCode(key);
        Entry xEntry = new Entry(key, object);

        if (saveSpace[location] == null) {
            this.saveSpace[location] = new LinkedList<>();
            this.saveSpace[location].add(xEntry);
        }else{
            this.saveSpace[location].add(xEntry);
        }
    }

    @Override
    public Object get(String key) {
        int location = GethashCode.getHashCode(key);
        if (saveSpace[location] == null) {
            return null;            
        }else{
            
            for (int i = 0; i < saveSpace[location].size(); i++) {
                if (saveSpace[location].get(i).key.toString().equals(key)) {
                    return saveSpace[location].get(i).value;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        CustoHashMap testcCustoHashMap = new CustoHashMap();
        String targeString = "Hero5000";

        for (int i = 0; i < 100000; i++) {
            testcCustoHashMap.put("Hero"+i, "he"+i);
        }
        System.out.println(GethashCode.getHashCode("Hero5000"));
        long start = System.currentTimeMillis();
        System.out.println(testcCustoHashMap.get(targeString)); 
        long end = System.currentTimeMillis();

        System.out.println((end-start)+"ms");

    }
    
}
