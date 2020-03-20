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
    <title>View Result</title>
</head>
<body class="">
<div class="my-3 my-md-5">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <form class="card form-horizontal">
                    <div class="card-body">
                        <h2 class="card-title"><b>BCSEA Service</b> >> View Result</h2>

                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                <div class="panel panel-default">
                                    <div class="panel-body">
                                        <div class="form-group">
                                            <label class="col-md-3 required">Enter CID :</label>

                                            <div class="col-md-4">
                                                <input type="text" id="cid" name="cid" class="form-control field">
                                            </div>

                                            <div class="col-sm-2">
                                                <button type="button" id="btnView" class="btn btn-primary">
                                                    <i class="fa fa-eye">View Result</i></button>
                                            </div>
                                        </div>
                                        <div id="resultDetail">
                                            <hr/>
                                            <div class="form-group">
                                                <label class="col-sm-2">Name : </label>

                                                <div class="col-sm-4">
                                                    <span id="studentName"></span>
                                                </div>
                                                <label class="col-sm-2"> School : </label>

                                                <div class="col-sm-4">
                                                    <span id="school"></span>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2">Index Number : </label>

                                                <div class="col-sm-4">
                                                    <span id="indexNo"></span>
                                                </div>
                                                <label class="col-sm-2"> Stream : </label>

                                                <div class="col-sm-4">
                                                    <span id="stream"></span>
                                                </div>
                                            </div>
                                            <table border="1"
                                                   class="table table-bordered"
                                                   id="resultTableId">
                                                <thead>
                                                <tr>
                                                    <th style="width: 20%">SUBJECT</th>
                                                    <th style="width: 10%">MARKS</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr class="hidden" id="mediaStudiesHidden">
                                                    <td>Media Studies</td>
                                                    <td id="mediaStudies"></td>
                                                </tr>
                                                <tr class="hidden" id="evsHidden">
                                                    <td>EVS</td>
                                                    <td id="evs"></td>
                                                </tr>
                                                <tr class="hidden" id="agricultureHidden">
                                                    <td>Agriculture</td>
                                                    <td id="agriculture"></td>
                                                </tr>
                                                <tr class="hidden" id="businessMathematicsHidden">
                                                    <td>Business Mathematics</td>
                                                    <td id="businessMathematics"></td>
                                                </tr>
                                                <tr class="hidden" id="biologyHidden">
                                                    <td>Biology</td>
                                                    <td id="biology"></td>
                                                </tr>
                                                <tr class="hidden" id="computerStudiesHidden">
                                                    <td>Computer Studies</td>
                                                    <td id="computerStudies"></td>
                                                </tr>
                                                <tr class="hidden" id="physicsHidden">
                                                <td>Physics</td>
                                                    <td id="physics"></td>
                                                </tr>
                                                <tr class="hidden" id="chemistryHidden">
                                                    <td>Chemistry</td>
                                                    <td id="chemistry"></td>
                                                </tr>
                                                <tr class="hidden" id="dzongkhaHidden">
                                                    <td>Dzongkha</td>
                                                    <td id="dzongkha"></td>
                                                </tr>
                                                <tr class="hidden" id="englishHidden">
                                                    <td>English</td>
                                                    <td id="english"></td>
                                                </tr>
                                                <tr class="hidden" id="mathsHidden">
                                                    <td>Maths</td>
                                                    <td id="maths"></td>
                                                </tr>
                                                <tr class="hidden" id="economicsHidden">
                                                    <td>Economics</td>
                                                    <td id="economics"></td>
                                                </tr>
                                                <tr class="hidden" id="geographyHidden">
                                                    <td>Geography</td>
                                                    <td id="geography"></td>
                                                </tr>
                                                <tr class="hidden" id="historyHidden">
                                                    <td>History</td>
                                                    <td id="history"></td>
                                                </tr>
                                                <tr class="hidden" id="accountsHidden">
                                                    <td>Accounts</td>
                                                    <td id="accounts"></td>
                                                </tr>
                                                <tr class="hidden" id="commerceHidden">
                                                    <td>Commerce</td>
                                                    <td id="commerce"></td>
                                                </tr>
                                                </tbody>
                                            </table>
                                            <br>
                                        </div>
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
