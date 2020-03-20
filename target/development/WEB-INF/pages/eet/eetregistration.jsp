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


<form class="form-group" id="averageFormId"  method="post">


    <div class="custom-control custom-radio custom-control-inline">
        <input type="radio" class="custom-control-input" id="customRadio" name="example" value="customEx">
        <label class="custom-control-label" for="customRadio">Entry</label>
    </div>
    <div class="custom-control custom-radio custom-control-inline">
        <input type="radio" class="custom-control-input" id="customRadio2" name="example" value="customEx">
        <label class="custom-control-label" for="customRadio2">Exit</label>
    </div>







    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label for="" class="col-sm-3">Type: </label>
                <div class="col-sm-9">
                    <select name="utype" id="utype" required class="form-control form-control-sm">
                    <option value="">CID</option>
                    <option value="">Driving Licence</option>
                    <option value="">Voter</option>


                </select>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label for="" class="col-sm-3">Identification No: </label>
                <div class="col-sm-9">
                    <input type="text" name="cid" id="cid" class="form-control form-control-sm">
                </div>
            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label for="" class="col-sm-3">Nationality: </label>
                <div class="col-sm-9">
                    <select name="utype" id="utype" required class="form-control form-control-sm">
                        <option value="">Select</option>


                    </select>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label for="" class="col-sm-3">Name: </label>
                <div class="col-sm-9">
                    <input type="text" name="cid" id="cid" class="form-control form-control-sm">
                </div>
            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label for="" class="col-sm-3">Gender: </label>
                <div class="col-sm-9">
                    <select name="utype" id="utype" required class="form-control form-control-sm">
                        <option value="">Select</option>


                    </select>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label for="" class="col-sm-3">Age: </label>
                <div class="col-sm-9">
                    <input type="text" name="cid" id="cid" class="form-control form-control-sm">
                </div>
            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label for="" class="col-sm-3">present Address: </label>
                <div class="col-sm-9">
                    <textarea name="remarks" id="remarks" rows="3" style="resize: none;" class="form-control"></textarea>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label for="" class="col-sm-3">Contact: </label>
                <div class="col-sm-9">
                    <input type="text" name="cid" id="cid" class="form-control form-control-sm">
                </div>
            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-6">
            <div class="form-group row">
                <label for="" class="col-sm-3">Reason: </label>
                <div class="col-sm-9">
                    <textarea name="remarks" id="remarks" rows="3" style="resize: none;" class="form-control"></textarea>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group row">
                <label for="" class="col-sm-3">Image: </label>
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
                <i class="fa fa-paper-plane"></i>Save
            </button>
            <button class="btn btn-danger" type="reset">
                <i class="fa fa-trash"></i> Cancel
            </button>

        </div>
    </div>



</form>
</body>
</html>
