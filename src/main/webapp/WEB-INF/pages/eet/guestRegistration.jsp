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
<form class="card form-horizontal" id="guestLogFormId" action="<c:url value="/guestLog"/>" method="post" enctype="multipart/form-data">
    <div class="row">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <div class="col-12">
            <div class="pull-right">
                <div class="booth">
                    <canvas id="canvas" width="200" height="200"></canvas>
                </div>
                <div align="center">
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#imageCaptureModal">
                        Launch Image Capture
                    </button>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="imagecapture.jsp"></jsp:include>
    <div class="row">
        <div class="col-4">
            </div>
        <div class="col-2">
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" class="custom-control-input" id="entry" name="entry" value="Entry">
                <label class="custom-control-label" for="entry">Entry</label>
             </div>
        </div>
        <div class="col-2">
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" class="custom-control-input" id="exit" name="entry" value="Exit" checked>
                <label class="custom-control-label" for="entry">Exit</label>
            </div>
        </div>
    </div>
<hr>
    <div class="row">
        <div class="col-12">
            <div class="form-group row">
                <label class="col-sm-3">Identification Type: </label>
                <div class="col-sm-7">
                    <form:select id="IdentificationTypeId" name="IdentificationTypeId" path="IdentificationType"
                                 class="form-control field">
                        <form:option value="" label="--SELECT--"></form:option>
                        <form:options items="${IdentificationType}" itemValue="valueInteger"
                                      itemLabel="text"></form:options>
                    </form:select>
                    <span class="text-danger" id="IdentificationTypeErrorMsg"></span>
                </div>
            </div>
        </div>

    </div>

    <div class="row">
        <div class="col-12">
            <div class="form-group row">
                <label class="col-sm-3">Identification No: </label>
                <div class="col-sm-7">
                    <input type="text" name="identificationNo" id="identificationNo" required class="form-control form-control-sm">
                    <span class="text-danger" id="identificationNoErrorMsg"></span>

                </div>
            </div>

        </div>

    </div>
<hr>
    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Nationality: </label>
                <div class="col-sm-9">
                    <form:select id="nationalityId" name="nationalityId" path="getNationalities"
                                 class="form-control field">
                        <form:option value="" label="--SELECT--"></form:option>
                        <form:options items="${getNationalities}" itemValue="valueInteger"
                                      itemLabel="text"></form:options>
                    </form:select>
                    <span class="text-danger" id="nationalityIdErrorMsg"></span>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Name: </label>
                <div class="col-sm-9">
                    <input type="text" name="name" id="name" required class="form-control form-control-sm">
                    <span class="text-danger" id="nameErrorMsg"></span>
                </div>
            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Gender: </label>
                <div class="col-sm-9">
                    <select name="gender" id="gender" required class="form-control field">
                        <option value="">Select</option>
                        <option value="M">Male</option>
                        <option value="F">Female</option>
                    </select>
                    <span class="text-danger" id="genderErrorMsg"></span>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Age: </label>
                <div class="col-sm-9">
                    <input type="text" name="age" id="age" required class="form-control form-control-sm">
                    <span class="text-danger" id="ageErrorMsg"></span>
                </div>
            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Present Address: </label>
                <div class="col-sm-9">
                    <textarea name="presentAddress" id="presentAddress" rows="3" style="resize: none;" class="form-control"></textarea>
                    <span class="text-danger" id="presentAddressErrorMsg"></span>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Contact: </label>
                <div class="col-sm-9">
                    <input type="text" name="contactNo" id="contactNo" class="form-control form-control-sm">
                    <span class="text-danger" id="contactNoErrorMsg"></span>
                </div>
            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Reason: </label>
                <div class="col-sm-9">
                    <form:select id="exitReasonId" name="exitReasonId" path="getExitReasons"
                                 class="form-control field">
                        <form:option value="" label="--SELECT--"></form:option>
                        <form:options items="${getExitReasons}" itemValue="valueInteger"
                                      itemLabel="text"></form:options>
                    </form:select>
                    <span class="text-danger" id="exitReasonIdErrorMsg"></span>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Reasons: </label>
                <div class="col-sm-9">
                    <textarea name="reasons" id="reasons" rows="3" style="resize: none;" class="form-control"></textarea>
                    <span class="text-danger" id="reasonsErrorMsg"></span>
                </div>
            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Thermometer Reading: </label>
                <div class="col-sm-9">
                    <input type="text" name="temperature" id="temperature" class="form-control form-control-sm">
                    <span class="text-danger" id="temperatureErrorMsg"></span>
                </div>
            </div>
        </div>
    </div>
    <hr>
    <div class="form-group row">
        <div class="col-sm-12">
            <button type="submit" id="btnSubmit" class="btn btn-primary">
                <i class="fa fa-check"></i>
                Register Visitor
            </button>
            <button class="btn btn-danger" type="reset">
                <i class="fa fa-trash"></i> Cancel
            </button>

        </div>
    </div>
</form>
</body>
</html>
