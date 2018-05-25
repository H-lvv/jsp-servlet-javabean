package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {
	public static String db_url="jdbc:mysql://localhost:3306/test?userUnicode=true&characterEncoding=UTF-8";
	public static String db_user="root";
	public static String db_password="627811";
	public static Connection getConn(){
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			conn=DriverManager.getConnection(db_url, db_user, db_password);
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		return conn;
	}

public static void close(Statement state,Connection conn){
	if(state!=null){
		try {
			state.close();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
	if(conn!=null){
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
	
}

public static void close(ResultSet rs,Statement state,Connection conn){
	if(rs!=null){
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
	if(state!=null){
		try {
			state.close();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
	if(conn!=null){
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
}


}