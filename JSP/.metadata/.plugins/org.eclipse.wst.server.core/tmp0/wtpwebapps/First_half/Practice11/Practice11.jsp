<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<!--���������а� 20170581 ��ȿ��
         �������� : ũ�� -->
<head>
<meta charset="EUC-KR">
<title>Practice 11</title>
<style>
table td {
	width:100px; height:200px;
	} 
p {
	font-size:50px;
	font-weight:900;
}
</style>
</head>
<body>
<%
out.println("<div align=center>");
out.println("<p>������ ���</p><hr>");
out.println("<table border=1px>");
int num = 2;
for (int i = 0; i < 2; i++)
{
	out.println("<tr>");
	for (int j = 0; j < 4; j++)
	{
		out.println("<td>");
		for (int k = 1; k <= 9; k++)
			out.println("&nbsp;&nbsp;" + num + " * " + k + " = " + num*k + "<br>");
		num++;
		out.println("</td>");
	}
	out.println("</tr>");
}
out.println("</table>");
out.println("</div>");
%>
</body>
</html>