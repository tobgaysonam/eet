<%--
  Created by IntelliJ IDEA.
  User: ICT-MoF
  Date: 3/21/2020
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card">
<div class="card-body">
    <form method="POST" action="">

            <h3><i class="fa fa-users"></i>   User Login Form</h3>
<hr>

        <div class="form-group row">
            <label for="email" class="col-md-4 col-form-label text-md-right">User ID :</label>

            <div class="col-md-6">
                <input id="email" type="email" class="form-control" name="email" value="" required >

            </div>
        </div>

        <div class="form-group row">
            <label for="password" class="col-md-4 col-form-label text-md-right">Password :</label>

            <div class="col-md-6">
                <input id="password" type="password" class="form-control " name="password" required >

            </div>
        </div>

        <div class="form-group row">
            <div class="col-sm-4">
                </div>
            <div class="col-sm-8">
                <button class="btn btn-success" type="submit">
                    <i class="fa fa-key"></i>Login
                </button>
                <button class="btn btn-danger" type="reset">
                    <i class="fa fa-close"></i> Cancel
                </button>

            </div>
        </div>
    </form>
</div>
</div>
            </div>
        </div>
    </div>


</body>
</html>
