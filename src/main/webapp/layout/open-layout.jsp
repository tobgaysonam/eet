<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page session="false" %>
<html>
<head>

    <title><sitemesh:write property="title"/></title>
    <jsp:include page="include/css.jsp"/>
    <jsp:include page="include/js.jsp"/>
</head>
<jsp:include page="include/open-header.jsp"/>
<jsp:include page="include/open-menu.jsp"/>
<body class="">
<div class="my-3 my-md-5">
    <div class="container">
        <sitemesh:write property="body"/>
    </div>
</div>
<jsp:include page="include/open-footer.jsp"/>
</body>
</html>
