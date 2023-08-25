package chapter20;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemoDAO {
    private static MemoDAO instance = new MemoDAO();

    public static MemoDAO getInstance() {
        return instance;
    }

    private MemoDAO() {
    }

    public List<MemoVO> selectMemos() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.30:1521:xe", "java", "oracle21c");
        Statement statement = connection.createStatement();
        StringBuilder builder = new StringBuilder();
        builder.append("select                ");
        builder.append("       NO,            ");
        builder.append("       TITLE,         ");
        builder.append("       CONTENT,       ");
        builder.append("       writer,        ");
        builder.append("       REGISTER_DATE, ");
        builder.append("       MODIFY_DATE    ");
        builder.append("from     ");
        builder.append("    MEMO ");
        builder.append("order by no ");
        String sql = builder.toString();
        ResultSet resultSet = statement.executeQuery(sql);
        List<MemoVO> memos = new ArrayList<>();

        while (resultSet.next()) {
            int no = resultSet.getInt("no");
            String title = resultSet.getString("title");
            String content = resultSet.getString("content");
            String writer = resultSet.getString("writer");
            Date registerDate = resultSet.getDate("register_date");
            Date modifyDate = resultSet.getDate("modify_date");
            memos.add(new MemoVO(no, title, content, writer, registerDate, modifyDate));
        }
        resultSet.close();
        statement.close();
        connection.close();
        return memos;
    }

    public MemoVO selectMemo(int selectNo) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.30:1521:xe", "java", "oracle21c");

        StringBuilder builder = new StringBuilder();
        builder.append("select                ");
        builder.append("       NO,            ");
        builder.append("       TITLE,         ");
        builder.append("       CONTENT,       ");
        builder.append("       writer,        ");
        builder.append("       REGISTER_DATE, ");
        builder.append("       MODIFY_DATE    ");
        builder.append("from     ");
        builder.append("    MEMO ");
        builder.append("where ");
        builder.append("       no = ? ");
        String sql = builder.toString();

        PreparedStatement statement = connection.prepareStatement(sql); //물음표 쓸 수 있는게 prepare
        statement.setInt(1, selectNo);
        ResultSet resultSet = statement.executeQuery();
        //위에 세 줄 잘 비교해야함.

        MemoVO memo = null;

        //where에 값이 있냐 없냐만 확인해서 결과만 알려주면 되니까. 없으면 초기값인 null을 반환, 조건이 맞다면 if문 값을 반환.
        if (resultSet.next()) {
            int no = resultSet.getInt("no");
            String title = resultSet.getString("title");
            String content = resultSet.getString("content");
            String writer = resultSet.getString("writer");
            Date registerDate = resultSet.getDate("register_date");
            Date modifyDate = resultSet.getDate("modify_date");
            memo = new MemoVO(no, title, content, writer, registerDate, modifyDate);
        }
        resultSet.close();
        statement.close();
        connection.close();
        return memo;
    }

    public int insertMemo(MemoVO vo) throws Exception { //insert의 성공 갯수를 보여줌 ->int로 반환
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.30:1521:xe", "java", "oracle21c");

        //createStatement 와 prepareStatement의 코드 구조가 다름. 주의할 것.
        StringBuilder builder = new StringBuilder();
        builder.append("INSERT into ");
        builder.append("    MEMO ");
        builder.append("    ( ");
        builder.append("         TITLE, ");
        builder.append("         CONTENT, ");
        builder.append("         writer ");
        builder.append("     ) ");
        builder.append("values ");
        builder.append("    ( ");
        builder.append("         ?, ");
        builder.append("         ?, ");
        builder.append("         ? ");
        builder.append("     ) ");

        String sql = builder.toString();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, vo.getTitle()); //데이터베이스의 인덱스는 1로 시작함.
        statement.setString(2, vo.getContent());
        statement.setString(3, vo.getWriter());

        //select -> executeQuery()
        //insert, update, delete -> executeUpdate()를 호출
        //리턴이 없는 실행문이라, executeQuery가 아닌 executeUpdate를 사용
        //리턴값은 실행 결과 몇개의 행이 성공했는지 알려준다. 실패하면 0 / 성공하면 1(보통 1개씩 하니까)
        int executedInsert = statement.executeUpdate();

        statement.close();
        connection.close();
        return executedInsert;
    }

    public int updateMemo(MemoVO vo) throws Exception {

        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.30:1521:xe", "java", "oracle21c");

        StringBuilder builder = new StringBuilder();
        builder.append("UPDATE MEMO ");
        builder.append("SET ");
        builder.append("    TITLE = ?, ");
        builder.append("    CONTENT = ?, ");
        builder.append("    writer = ? ");
        builder.append("where NO = ?");


        String sql = builder.toString();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, vo.getTitle()); //데이터베이스의 인덱스는 1로 시작함.
        statement.setString(2, vo.getContent());
        statement.setString(3, vo.getWriter());
        statement.setInt(4, vo.getNo());

        int executedUpdate = statement.executeUpdate();

        statement.close();
        connection.close();
        return executedUpdate;
    }

    public int deleteMemo(int deleteNo) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.30:1521:xe", "java", "oracle21c");

        StringBuilder builder = new StringBuilder();
        builder.append(" DELETE ");
        builder.append(" From ");
        builder.append(" MEMO ");
        builder.append(" where ");
        builder.append(" NO = ? ");

        String sql = builder.toString();
        PreparedStatement statement = connection.prepareStatement(sql); //물음표 쓸 수 있는게 prepare
        statement.setInt(1, deleteNo);

        int executedDelete = statement.executeUpdate();

        statement.close();
        connection.close();
        return executedDelete;
    }

}
