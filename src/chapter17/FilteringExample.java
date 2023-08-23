package chapter17;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("신용권");
        list.add("신민철");
     /*   List<String> tempList = new ArrayList<>();
        for (String s : list) {//중간처리
            if (!tempList.contains(s)) {
                tempList.add(s);
            }
        }
        for (String s : tempList) {//종단처리
            System.out.println(s);
            tempList.remove(s);
        }*/
//        list.stream().distinct().forEach(System.out::println);

        //list에서 신으로 시작하는 이름만 출력하시오.
            List<String> tempList = new ArrayList<>();
        for (String s : list) {//중간처리
            if (s.startsWith("신")) {
                tempList.add(s);
            }
        }
        for (String s : tempList) {//종단처리
            System.out.println(s);
        }
        list.stream().filter(s -> s.startsWith("신")).distinct().forEach(System.out::println);

    }
}
