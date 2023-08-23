package chapter12;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동$이수홍$박연수$김자바$최명호";
        String data2 = "홍길동&이수홍,박연수,김자바-최명호";
        String data3 = "홍길동&이수홍,박연수,김자바-최명호";
        String[] data1Split = data1.split("\\$");
        System.out.println(data1Split[4]);

        String[] data2Split = data2.split("&|,|-");//&,/,- 3가지 구분자로 나뉨.
        String[] data3Split = data2.split("[&,-]");//&,/,- 3가지 구분자로 나뉨.


        StringTokenizer tokenizer = new StringTokenizer(data1, "$");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

    }
}
