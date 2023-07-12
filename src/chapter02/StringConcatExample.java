package chapter02;

public class StringConcatExample {
    public static void main(String[] args) {
        int result1 = 10+2+8;
        String result2 = 10+2+"8";
        //숫자를 문자로 캐스팅
        int a = 10;
        String str =a +"";
        //문자를 숫자로 캐스팅-문자 뒤에 큰 따옴표 더한다.
        System.out.println("a="+a);
        String value = "100";
        int i = Integer.parseInt(value);
        double v = Double.parseDouble(value);
        System.out.println(str);
        System.out.println(i);
        System.out.println(v);


    }
}
