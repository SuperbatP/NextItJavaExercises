package chapter05;

import java.util.Arrays;

public class AdvancedOfForExample {
    public static void main(String[] args) {//배열에서 인덱스가 필요 없는 경우, 값만 반환하는 경우
        int[] scores = {95, 71, 84, 93, 87};

        int sum = 0;
        for (int i = 0; i < scores.length ; i++) {
            sum += scores[i];
        } //인덱스를 사용한 방식
        for (int score : scores) {
            sum += score;
        }//foreach문을 이용한 방식.

        //최근 트랜드 : froi, foreach를 지양 - 함수형 프로그래밍 방식
        //Stream API(JDK 1.8에 추가된 방식)
        sum = Arrays.stream(scores).sum();
        double avg = Arrays.stream(scores).average().getAsDouble();

        System.out.println(sum);
        System.out.println(avg);
    }
}
