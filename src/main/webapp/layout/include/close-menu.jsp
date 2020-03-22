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
                    <%--<security:authorize access="hasAuthority('0101-02-VIEW')">--%>
                    <li class="nav-item ">
                        <a href="<c:url value="/guestLogDetail"/>" class="nav-link" style="color:black">
                            <i class="fa fa-paper-plane"></i>Data Entry</a>
                    </li>
                    <%-- </security:authorize>--%>
                   <%-- <security:authorize access="hasAuthority('0101-01-VIEW')">--%>
                    <li class="nav-item ">
                        <a href="<c:url value="/userRegistration"/>" class="nav-link" style="color:black">
                            <i class="fa fa-list"></i>User Registration</a>
                    </li>
                    <%--</security:authorize>--%>
                    <security:authorize access="hasAuthority('0101-01-VIEW')">
                        <li class="nav-item ">
                            <a href="" class="nav-link" style="color:black">
                                <i class="fa fa-list"></i>Master Management</a>
                        </li>
                    </security:authorize>
                </ul>
            </div>
        </div>
    </div>
</div>