<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<div class="header collapse d-lg-flex p-0" id="headerMenuCollapse">
    <div class="container">
        <div class="row pull-right">
            <div class="col-lg order-lg-first">
                <ul class="nav nav-tabs border-0 flex-column flex-lg-row">
                    <li class="nav-item ">
                        <a href="/" class="nav-link" style="color:black">
                            <i class="fa fa-home"></i>Home</a>
                    </li>
                    <li class="nav-item">
                        <a href="/userrego" class="nav-link" style="color:black"> <i
                                class="fa fa-calculator"></i>User Registration</a>
                    </li>
                    <li class="nav-item">
                        <a href="/dentry" class="nav-link" style="color:black"> <i
                                class="fa fa-calculator"></i>Data Entry</a>
                    </li>

                </ul>
            </div>
        </div>
    </div>
</div>