package kr.fc.jdbc;

public interface JdbcConnection {
    public void getConnection(String URL, String userName, String password); // 데이터 베이스 연결 동작
}
