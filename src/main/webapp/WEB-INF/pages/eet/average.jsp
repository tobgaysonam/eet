<%--
  Created by IntelliJ IDEA.
  User: nzepa
  Date: 3/6/2020
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form class="card form-horizontal" id="averageFormId"  method="post">

    <div class="form-group col-md-12"></div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Enter the number:</label>

        <div class="col-md-4">
            <input type="text" name="countNumber" id="countNumber" class="form-control">
        </div>
    </div>

    <div class="form-group col-md-12">
        <div class="col-md-2 col-md-offset-3">
            <input type="button" class="btn btn-xs btn-info btn-block" value="OK" id="btnOk">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Enter number:</label>

        <div class="col-md-4">
            <input type="text" name="numbers" id="numbers" class="form-control">
        </div>
    </div>

    <div class="form-group col-md-12">
        <div class="col-md-2 col-md-offset-3">
            <input type="button" class="btn btn-xs btn-info btn-block" value="Enter" id="btnEnter">
        </div>
    </div>

</form>
</body>
</html>
