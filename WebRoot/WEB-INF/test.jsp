<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>  
<%@ page import="java.sql.*" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"  
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">  
<html xmlns="http://www.w3.org/1999/xhtml">  
<head>  
    <title> С�ű����� </title>    
</head>  
<body>  
<%  
//ע�����ݿ�����  
Class.forName("com.mysql.jdbc.Driver");  
//��ȡ���ݿ�����  
Connection conn = DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/test","root","627811");  
//����Statement  
Statement stmt = conn.createStatement();  
//ִ�в�ѯ  
ResultSet rs = stmt.executeQuery("select * from users");  
%>  
<table>  
<%  
//���������  
while(rs.next())  
{%>  
    <tr>  
        <!-- �������� -->  
        <td><%=rs.getString("username")%></td>  
        <td><%=rs.getString("password")%></td>  
    </tr>  
<%}%>  
</table>  
</body>  
</html> 