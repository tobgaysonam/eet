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
<form class="card form-horizontal" id="averageFormId"  method="post">

    <div class="form-group col-md-12"></div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">User CID</label>

        <div class="col-md-4">
            <input type="text" name="cid" id="cid" class="form-control">
        </div>
    </div>


    <div class="form-group col-md-12">
        <label class="col-md-3 required">Name</label>

        <div class="col-md-4">
            <input type="text" name="name" id="name" class="form-control">
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Position</label>

        <div class="col-md-4">
            <select name="position" id="position" required class="form-control form-control-sm">
                <option value="">-- Select Any One --</option>

            </select>
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">User Type</label>

        <div class="col-md-4">
            <select name="utype" id="utype" required class="form-control form-control-sm">
                <option value="">pvt</option>
                <option value="">Govt</option>
                <option value="">Healthworker</option>
                <option value="">Volunter</option>
                <option value="">Arm Force</option>


            </select>
        </div>
    </div>

    <div class="form-group col-md-12">
        <label class="col-md-3 required">Location</label>

        <div class="col-md-4">
            <select name="location" id="location" required class="form-control form-control-sm">
                <option value="">-- Select Any One --</option>

            </select>
        </div>
    </div>
    <div class="form-group col-md-12">
        <label class="col-md-3 required">Position</label>

        <div class="col-md-4">
            <select name="position" id="position" required class="form-control form-control-sm">
                <option value="">-- Select Any One --</option>

            </select>
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
