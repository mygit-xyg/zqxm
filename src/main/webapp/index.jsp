<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="utf-8"%>

<html>
<body>
    <c:forEach items="${requestScope.list}" var="s">
        ${s.id},${s.name},${s.age},${s.sexType},${s.telephone},${s.address},
    </c:forEach>
</body>
</html>
