package kr.fc.java;

import kr.fc.jdbc.JdbcConnection;
import kr.fc.jdbc.MySQLConnection;
import kr.fc.jdbc.OracleConnection;

public class FC21 {
    public static void main(String[] args) {
        JdbcConnection oracleConn = new OracleConnection();
        oracleConn.getConnection("URL","ID","password");

        JdbcConnection mysqlConn = new MySQLConnection();
        mysqlConn.getConnection("URL","ID","password");
    }
}
