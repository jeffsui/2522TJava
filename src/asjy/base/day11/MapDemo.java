package asjy.base.day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        /**
         * K，V 构成 容器类型
         * K 不重复
         * V 可以重复
         */
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(Integer.valueOf(1001),"Jack");//增加
        map1.put(Integer.valueOf(1002),"Rose");
        map1.put(Integer.valueOf(1003),"Mick");
        System.out.println(map1);
        System.out.println(map1.containsKey(Integer.valueOf(1001)));
        System.out.println(map1.containsKey(Integer.valueOf(1003)));
        System.out.println(map1.get(Integer.valueOf(1002))); //根据key获取value,如果key不存在,返回null
        //遍历map
        Set<Integer> setInteger = map1.keySet();
        for (Integer key:setInteger ){
            System.out.println(key+":"+map1.get(key));
        }
        //map遍历第二种方法
        Set<Map.Entry<Integer, String>> entries = map1.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        //Iterator迭代器对象
        while(iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            Integer key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"->"+value);
        }
        /**
         * remove(key)-->Object : 删除成功返回key对应value;否则,返回null
         * remove(key,value)->boolean 删除成功返回true;否则,返回false
         */
//        String remove = map1.remove(Integer.valueOf(1004));
//        System.out.println("删除的key"+remove);
        boolean mick = map1.remove(Integer.valueOf(1004), "Mick");
        System.out.println("删除"+mick);
        //putIfAbsent
        map1.putIfAbsent(Integer.valueOf(1005),"Tom");
        System.out.println(map1);
        map1.putIfAbsent(Integer.valueOf(1003),"Kitty");
        System.out.println(map1);

        //computeIfAbsent


    }
}
