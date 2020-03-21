<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ICT-MoF
  Date: 3/20/2020
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form class="card form-horizontal" id="userRegistrationFormId" action="<c:url value="/userRegistration"/>" method="post" enctype="multipart/form-data">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">User CID: </label>
                <div class="col-sm-9">
                    <input type="text" name="cid" id="cid" required class="form-control form-control-sm">
                </div>
            </div>

        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Name: </label>
                <div class="col-sm-9">
                    <input type="text" name="name" id="name" required class="form-control form-control-sm">
                </div>
            </div>

        </div>
    </div>


    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Designation: </label>
                <div class="col-sm-9">
                    <input type="text" designation="contact" id="designation" class="form-control">
                </div>
            </div>

        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">User Type: </label>
                <div class="col-sm-9">
                    <form:select id="userTypeId" name="userTypeId" path="getUserType"
                                 class="form-control field">
                        <form:option value="" label="--SELECT--"></form:option>
                        <form:options items="${getUserType}" itemValue="valueInteger"
                                      itemLabel="text"></form:options>
                    </form:select>
                </div>
            </div>

        </div>
    </div>


    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Gate: </label>
                <div class="col-sm-9">
                    <form:select id="gateId" name="gateId" path="getGates"
                                 class="form-control field">
                        <form:option value="" label="--SELECT--"></form:option>
                        <form:options items="${getGates}" itemValue="valueInteger"
                                      itemLabel="text"></form:options>
                    </form:select>
                </div>
            </div>

        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Working Address: </label>
                <div class="col-sm-9">
                    <input type="text" name="waddress" id="waddress" class="form-control">
                </div>
            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Contact: </label>
                <div class="col-sm-9">
                    <input type="text" name="contact" id="contact" class="form-control">
                </div>
            </div>

        </div>

    </div>


    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Password: </label>
                <div class="col-sm-9">
                    <input type="password" name="password" id="password" class="form-control">
                </div>
            </div>

        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Confirm Password: </label>
                <div class="col-sm-9">
                    <input type="password" name="cpassword" id="cpassword" class="form-control">
                </div>
            </div>

        </div>

    </div>


    <hr>
    <div class="form-group row">
        <div class="col-sm-12">
            <button class="btn btn-success" type="submit">
                <i class="fa fa-paper-plane"></i>Register User
            </button>
            <button class="btn btn-danger" type="reset">
                <i class="fa fa-trash"></i> Cancel
            </button>

        </div>
    </div>

</form>
</body>
</html>
