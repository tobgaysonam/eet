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
<form class="card form-horizontal" id="calculatorFormId" method="post">

    <div class="form-group col-md-12"></div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Enter First Number:</label>

        <div class="col-md-4">
            <input type="text" name="firstNumber" id="firstNumber" class="form-control">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Enter Second Number:</label>

        <div class="col-md-4">
            <input type="text" name="secondNumber" id="secondNumber" class="form-control">
        </div>
    </div>



    <div class="form-group col-md-12">
        <div class="col-md-2 col-md-offset-3">
            <input type="button" class="btn btn-xs btn-info btn-block" value="Calculate" id="btnCalculate">
        </div>

    </div>


    <div class="form-group col-md-12">
        <label class="col-md-3">Addition:</label>

        <div class="col-md-4">
            <input type="text" name="addition" id="addition" class="form-control field" readonly>
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3">Subtraction:</label>

        <div class="col-md-4">
            <input type="text" name="subtraction" id="subtraction" class="form-control field" readonly>
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3">Multiplication:</label>

        <div class="col-md-4">
            <input type="text" name="multiplication" id="multiplication" class="form-control field" readonly>
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3">Division:</label>

        <div class="col-md-4">
            <input type="text" name="division" id="division" class="form-control field" readonly>
        </div>
    </div>

</form>
</body>
</html>
