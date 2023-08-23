package chapter03;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = score>90? 'A' : 'B';//삼항연산자 조건?true;false
        System.out.println(score+"점은 "+grade+"등급입니다.");

        int score1 = 72;
        char grade1 = score1>90? 'A' : (score1>80? 'B':'C');//if문 배우기 전에 쓸 쑤 있는 형태
        System.out.println(score1+"점은 "+grade1+"등급입니다.");
    }
}
