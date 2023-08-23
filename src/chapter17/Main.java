package chapter17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Member> iveList = new ArrayList<>();
        iveList.add(new Member("안유진", 21));
        iveList.add(new Member("가을", 22));
        iveList.add(new Member("이서", 17));
        iveList.add(new Member("장원영", 20));
        iveList.add(new Member("리즈", 20));
        iveList.add(new Member("레이", 20));

        Stream<Member> stream = iveList.stream();
        stream.forEach(o->{
            System.out.println(o.getName() + " : " + o.getAge());
        });

        //중간처리 : filter sorted 여러개 사용가능
        //종단처리 : count, max, min, 집계함수 등. forEach 종단처리는 하나만...

        stream.sorted((o1, o2) -> o1.getAge() - o2.getAge());



    }
}
