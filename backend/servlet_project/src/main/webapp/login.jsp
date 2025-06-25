<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% String errorMsg=(String)request.getAttribute("errorMsg"); if(errorMsg!=null){%>

<p style="color: red; font-size: 30px"><%=errorMsg %></p>

<%} %>

        login Page          
   <form action="login" method="post">
      Name: <input name="name" id="name" placeholder="enter name"><br> <br>
    Phone: <input name="phone" id="phone" placeholder="enter phone"><br> <br>
    <button>SIGNIN</button>
   </form>
</body>
</html>