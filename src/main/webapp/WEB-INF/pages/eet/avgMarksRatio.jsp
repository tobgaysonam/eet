<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 8/22/2019
  Time: 11:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Average Marks Ratio</title>
</head>
<body class="">
<div class="my-3 my-md-5">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <form class="card form-horizontal">
                    <div class="card-body">
                        <h2 class="card-title"><b>BCSEA Service</b> >> Average Marks Ratio</h2>

                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                <div class="panel panel-default">
                                    <div class="panel-body">

                                        <table border="1" class="table table-bordered" id="resultTableId">
                                            <thead>
                                            <tr>
                                                <th style="width: 20%">Subject</th>
                                                <th style="width: 20%">Male</th>
                                                <th style="width: 20%">Female</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td style="width: 20%">English</td>
                                                <td style="width: 20%" id="englishMarksMale"></td>
                                                <td style="width: 20%" id="englishMarksFemale"></td>
                                            </tr>
                                            <tr>
                                                <td style="width: 20%">Dzongkha</td>
                                                <td style="width: 20%" id="dzongkhaMarksMale"></td>
                                                <td style="width: 20%" id="dzongkhaMarksFemale"></td>
                                            </tr>
                                            </tbody>
                                        </table>
                                        <br>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
