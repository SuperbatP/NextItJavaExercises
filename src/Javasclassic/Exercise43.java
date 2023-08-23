package Javasclassic;

public class Exercise43 {
    public static void main(String[] args) {
        //1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.-피보나치 수열?
        System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.");
        int sum = 0;
        int totalsum = 0;
        for(int i=1; i<=10; i++) {
            sum +=i;
            totalsum +=sum;
        }
        System.out.println(totalsum);

    }
}
