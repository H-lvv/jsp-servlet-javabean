package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import utils.DBUtil;

public class Userdao {
	public int login(String username,String password){
		Connection conn=DBUtil.getConn();
		Statement state=null;
		ResultSet rs=null;
		int flag=0;
		try {
			String sql="select * from users where username='"+username+"'";
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			if(rs.next()){
				if(rs.getString("password").equals(password)){
					flag=1;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally{
			DBUtil.close(rs,state,conn);
		}
		return flag;
	}

}
