package kr.fc.jdbc;

public class MySQLConnection implements JdbcConnection{
    @Override
    public void getConnection(String URL, String userName, String password) {
        System.out.println("URL, username, password 정보로 MySQL 연결 시도");
    }
}
