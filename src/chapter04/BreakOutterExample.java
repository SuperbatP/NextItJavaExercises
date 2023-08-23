package chapter04;

public class BreakOutterExample {
    public static void main(String[] args) {
        Outter : for(char upper='A'; upper<='Z'; upper++){
            for (char lowwer = 'a'; lowwer<='z' ; lowwer++) {
                System.out.println(upper+"-"+lowwer);
                if (lowwer=='g'){
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
