<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>  
<%@ page import="java.sql.*" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"  
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">  
<html xmlns="http://www.w3.org/1999/xhtml">  
<head>  
    <title> 小脚本测试 </title>    
</head>  
<body>  
<%  
//注册数据库驱动  
Class.forName("com.mysql.jdbc.Driver");  
//获取数据库连接  
Connection conn = DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/test","root","627811");  
//创建Statement  
Statement stmt = conn.createStatement();  
//执行查询  
ResultSet rs = stmt.executeQuery("select * from users");  
%>  
<table>  
<%  
//遍历结果集  
while(rs.next())  
{%>  
    <tr>  
        <!-- 输出结果集 -->  
        <td><%=rs.getString("username")%></td>  
        <td><%=rs.getString("password")%></td>  
    </tr>  
<%}%>  
</table>  
</body>  
</html> 