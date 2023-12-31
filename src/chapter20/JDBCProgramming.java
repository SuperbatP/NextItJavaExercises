package chapter20;

import java.sql.*;

public class JDBCProgramming {
    public static void main(String[] args) throws Exception {
        //1. 드라이버 등록(Reflection)
        Class.forName("oracle.jdbc.OracleDriver");

        //2. DBMS 접속 정보를 가지고 접속
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.30:1521:xe", "java", "oracle21c");

        //3. SQL을 작성할 worksheet(createStatement) 생성
        Statement statement = connection.createStatement();
        //4. 쿼리 작성
        String sql = "select * from employees"; //쿼리문 작성할때는 세미콜론 작성하면 오류남.
        //5. 쿼리 실행
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            int employeeId = resultSet.getInt("employee_id");
            String empName = resultSet.getString("emp_name");
            String phoneNumber = resultSet.getString("phone_number");
            Date hireDate = resultSet.getDate("hire_date");
            int salary = resultSet.getInt("salary");
            System.out.printf("%d\t%s\t%s\t%s\t%d\n",employeeId,empName,phoneNumber,hireDate,salary);
        }

        //6.자원반납
        resultSet.close();
        statement.close();
        connection.close();
    }
}
