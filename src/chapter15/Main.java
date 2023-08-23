package chapter15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String str : list){
            System.out.println(str);
        }

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");

        for(String str : set){
            System.out.println(str);
        }//get이 없어서 향상된 for문 써야함.

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        } //set 반복문이 두 가지 버전. 다 알아야함.문

        Map<String, String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        //map 반복을 못하고, set로 반복합니다. 중복이 불가능

        //1. keySet for
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println(key);
            System.out.println(map.get(key));
        }//key 값은 set으로 지정하고, value는 key를 알면 바로 매칭할 수 있으니까... 그 다음에 map.get으로 value로 가져옴.

        //2. keySet Iterator
        Iterator<String> iterator1 = keySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(map.get(iterator.next()));
        }

        //3. entrySet for문 entry-> map의 한 세트 값.
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String>  entry: entries){
            entry.getKey();
            entry.getValue();
        }


        //4. entrySet iterator
        Iterator<Map.Entry<String, String>> iterator2 = entries.iterator();
        while(iterator2.hasNext()){
            Map.Entry<String, String> entry = iterator2.next();
        }
    }
}
