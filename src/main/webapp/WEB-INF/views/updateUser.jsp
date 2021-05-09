<%@ page import="com.JiangXinxin.model.User" %><%--
  Created by IntelliJ IDEA.
  User: 鑫鑫
  Date: 2021/4/24
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User update</h1>
<body>
<%
    User u=(User)session.getAttribute("user");
%>
<form method="post" action="updateUser">
    <input type="hidden" name="id" value="<%=u.getId()%>">
    <span style="color:#FFB6C1">Username</span> <input type="text" name="name" required="true" style="background-color: #EAEAAE" value="<%=u.getUsername()%>"><br/>
    <span style="color: #FFB6C1">Password</span> <input type="password" name="password" maxlength="8" style="background-color: #EAEAAE" value="<%=u.getPassword()%>"><br/>
    <span style="color: #FFB6C1">Email</span><input type="email" name="email" required="true"style="background-color: #EAEAAE" value="<%=u.getEmail()%>"><br/>
    <span style="color: #FFB6C1">Gender</span>
    <label for="1">
        <input type="radio" name="gender" value="male" <%= "male".equals(u.getGender()) ?"checked" :""%> id="1"/> <span style="color: #FFB6C1">Male</span>
    </label>

    <label for="2">
        <input type="radio" name="gender" value="female" <%= "female".equals(u.getGender()) ?"checked" :""%>id="2"/> <span style="color: #FFB6C1">Female</span>
    </label>
    <br/>
    <span style="color: #FFA500">Date of birth(yyyy-mm-dd)</span><input type="date"name="date"  value="<%=u.getBirthDate()%>" pattern="yyyy-mm-dd" required="true"style="background-color: #EAEAAE"><br/>
    <input type="submit" value="Save Changes"style="background-color: #EAEAAE">
</form>
<%@include file="footer.jsp"%>
</body>
</html>