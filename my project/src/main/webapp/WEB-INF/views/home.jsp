<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
 
<title>GeonYeong</title>
    <%@include file="./common_resource.jsp"%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/home.js"></script>
    <link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet" />
 
</head>
<body>
    <h1>Wine_quality</h1>
    <button id = "load_wineList" type = "button">와인 데이터 가져오기</button>
    <table>
        <thead>
            <tr>
                <th>product_seq</th>
                <th>fixed_acidity</th>
                <th>volatile_acidity</th>
                <th>citric_acid</th>
                <th>residual_sugar</th>
                <th>chlorides</th>
                <th>free_sulfur_dioxide</th>
                <th>total_sulfur_dioxide</th>
                <th>density</th>
                <th>PH</th>
                <th>sulphates</th>
                <th>alcohol</th>
                <th>quality</th>
            </tr>
        </thead>
        <tbody id ="wineList" >
            <!--<c:forEach items="${wineList}" var="product_quality">
                <tr>
                    <td>${product_quality.product_seq}</td>
                    <td>${product_quality.fixed_acidity}</td>
                    <td>${product_quality.volatile_acidity}</td>
                    <td>${product_quality.citric_acid}</td>
                    <td>${product_quality.residual_sugar}</td>
                    <td>${product_quality.chlorides}</td>
                    <td>${product_quality.free_sulfur_dioxide}</td>
                    <td>${product_quality.total_sulfur_dioxide}</td>
                    <td>${product_quality.density}</td>
                    <td>${product_quality.PH}</td>
                    <td>${product_quality.sulphates}</td>
                    <td>${product_quality.alcohol}</td>
                    <td>${product_quality.quality}</td>
                </tr>
            </c:forEach>-->
        </tbody>
    </table>
 
 
</body>
</html>
