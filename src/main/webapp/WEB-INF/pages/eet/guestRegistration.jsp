<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<form class="form-group" id="guestLogFormId"  method="post" enctype="multipart/form-data">
    <div class="row">
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
                <input type="radio" class="custom-control-input" id="customRadio" name="example" value="customEx">
                <label class="custom-control-label" for="customRadio">Entry</label>
             </div>
        </div>
        <div class="col-2">
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" class="custom-control-input" id="customRadio2" name="example" value="customEx" checked>
                <label class="custom-control-label" for="customRadio2">Exit</label>
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
                </div>
            </div>
        </div>

    </div>

    <div class="row">
        <div class="col-12">
            <div class="form-group row">
                <label class="col-sm-3">Identification No: </label>
                <div class="col-sm-7">
                    <input type="text" name="identification" id="identification" required class="form-control form-control-sm">
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
                <label class="col-sm-3">Gender: </label>
                <div class="col-sm-9">
                    <select name="gender" id="gender" required class="form-control form-control-sm">
                        <option value="">Select</option>
                        <option value="M">Male</option>
                        <option value="F">Female</option>
                        <option value="O">Others</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Age: </label>
                <div class="col-sm-9">
                    <input type="text" name="age" id="age" required class="form-control form-control-sm">
                </div>
            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">present Address: </label>
                <div class="col-sm-9">
                    <textarea name="paddress" id="paddress" rows="3" style="resize: none;" class="form-control"></textarea>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Contact: </label>
                <div class="col-sm-9">
                    <input type="text" name="contact" id="contact" class="form-control form-control-sm">
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
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Reasons: </label>
                <div class="col-sm-9">
                    <textarea name="reasons" id="reasons" rows="3" style="resize: none;" class="form-control"></textarea>
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
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label class="col-sm-3">Image: </label>
                <div class="col-sm-9">
                    <input type="file" name="file_path" >
                </div>
            </div>

        </div>

    </div>

    <hr>
    <div class="form-group row">
        <div class="col-sm-12">
            <button class="btn btn-success" type="submit">
                <i class="fa fa-paper-plane"></i>Register Visitor
            </button>
            <button class="btn btn-danger" type="reset">
                <i class="fa fa-trash"></i> Cancel
            </button>

        </div>
    </div>
</form>
</body>
</html>
