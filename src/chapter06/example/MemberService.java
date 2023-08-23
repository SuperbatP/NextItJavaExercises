package chapter06.example;

public class MemberService { //login 과 logout은 서비스임. 메소드는 반드시 리턴타입을 지정해줘야함.
    boolean login(String id, String password) { //boolean 과 같은 리턴타입이 정해지면 return을 같이 작성해주고, 코드 작성.
        if (id.equals("hong") && password.equals("12345")) {
            return true;
            //return id.equals("hong") && password.equals("12345"); 로 더 간단하게 표현 가능
            //어차피 <id.equals("hong") && password.equals("12345")>값이 true, false로 나타나니까!
        } //else 생략가능.
        return false;
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다");
    }

    public static void main(String[] args) {
        MemberService service = new MemberService();
        boolean result = service.login("hong", "12345");
        if (result) { //if 조건식에 '== true' 문은 지양할 것.
            System.out.println("로그인 되었습니다.");
            service.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}





