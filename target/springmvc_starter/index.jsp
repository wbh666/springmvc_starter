<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2020/5/13
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>入门程序</h3>

    <a href="hello?username=wang博华">入门程序</a>


    <form action="account" method="post">
        accountName:<input type="text" name="name"/>
        accountAge:<input type="text" name="age"/>
        date:<%--<input type="text" name="date"/>--%>
        <input type="date" name="date"/>

        userName:<input type="text" name="user.name"/>
        userAge:<input type="text" name="user.age"/>
        <input type="submit"/>
    </form>
</body>
</html>
