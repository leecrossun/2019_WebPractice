<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<!--���������а� 20170581 ��ȿ��
         �������� : ũ�� -->
<head>
<meta charset="EUC-KR">
<title>Practice 10</title>
<style>
	table td {
	text-align:center;
	width:80px; height:30px;
	font-weight:900;
	} 
</style>
</head>
<body>
<%
	out.println("<div align=center>");
	out.println("<table border=1px> ");
	out.println("<tr>");
	out.println("<td ><font color=red >��</font></td>");
	
	String s[] = {"��","ȭ","��","��","��"};
	for (int i = 0; i < 5; i++)
		out.println("<th>" + s[i] + "</th>");
	
	out.println("<td><font color=blue >��</font></td>");
	out.println("</tr>");
	
	for (int i = 0; i < 4; i++)
	{
		out.println("<tr>");
		for (int j = 0; j < 7; j++)
			out.println("<td> &nbsp; </td>");
		out.println("</tr>");
	}
	
	out.println("</table>");
	out.println("</div>");
%>
</body>
</html>