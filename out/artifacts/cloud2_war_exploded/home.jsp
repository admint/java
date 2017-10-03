<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>เข้าสู่ระบบสำเร็จ</title>
        <!-- Latest compiled and minified CSS -->

    </head>
    <body>
        <h1>ยินดีต้อนรับ</h1>
        <b style="color: red;">${text}</b><br><br>
       <c:forEach items="${patientList}" var="myItem" varStatus="myItemStat">patientList[${myItemStat.index}] = ${myItem}</c:forEach>
        <%=request.getAttribute("text")%>
    </body>
</html>