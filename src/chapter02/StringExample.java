package chapter02;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
        String b = "b";// 블럭지정 후 ' or " 누르면 특수기호만 바뀜 ㅇ0ㅇ!
        String str = "나는 \"자바\"를 배웁니다."; // 앞에 \넣으면 특수기호로 인식("'nrt\)
        //개행의 경우 운영체제에 따라 한 줄, 두 줄이 다름. 리눅스의 경우 \n\r을 한 줄로 인식, 윈도우는 두 줄로 인식.
        String multiStr = """
                여러 라인을
                문자열로 
                표현 가능합니다.
                """;//""" 큰따옴표 3개면 여러 문장 한 번에 표시 가능. 13ver 부터!
        System.out.println(multiStr);
    }
}
