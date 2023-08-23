package chapter12;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class PrintDateExample {
    public static void main(String[] args) {
        Date date1 = new Date();//실행한 시점의 시각
        System.out.println(date1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초");
        String myData = simpleDateFormat.format(date1);
        System.out.println(myData);

        Calendar calendar = Calendar.getInstance();//시간이라는 것은 기존의 객체를 가져오는것->싱글톤패턴 사용.
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);//0~11 현재 월을 출력하려면 +1해야함.
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.printf("%d년 %d월 %d일 (%d) %d시 %d분 %d초", year, month + 1, date, day, hour, minute, second);
        System.out.println();

        //LocalDateTime jdk8이상 -> 컴퓨터의 지역정보를 기반으로 형식을 반영
        //위의 두 형식의 장점만 뽑아서 만든 것. 싱글톤 방식으로 보안을 잡고, 객체 생성으로 포맷형식을 지정해줌.
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //Method chaining 방식->트렌드 ().() 점 찍고 메소드 계속 나오는거 ㅠ0ㅠ
        String myDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초"));
        System.out.println(myDate);
        LocalDateTime lastDate = LocalDateTime.of(2023, 1, 1, 0, 0, 0);

    }
}
