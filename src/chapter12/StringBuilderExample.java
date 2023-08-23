package chapter12;

public class StringBuilderExample {
    public static void main(String[] args) {
        String userId = "a001";
        String password = "1234";

        StringBuilder builder = new StringBuilder();
        builder.append("select id, password, name, from member where id= '")
                .append(userId)
                .append("' and password = '")
                .append(password)
                .append("'");

        String s = """
                여러문자열을 보여줄 때 큰따옴표 3개 사용
                                
                SELECT
                    id,
                    password,
                    name
                FROM member
                where id = 'a001'
                """;
    }
}
