<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<jsp:include page="header.jsp"/>
</head>
<body>
<h1 align="center">지역 당구장 검색</h1>
<div>
	<table align="center" border="1" width="100%" height="300" class="table table-striped table-dark" >
		<thead>
	    <tr align="center">
	      <th scope="col">No</th>
	      <th scope="col">당구장이름</th>
	      <th scope="col">주소</th>
	      <th scope="col">대대가격</th>
	      <th scope="col">전화번호</th>
	      <th scope="col">상세보기</th>
	    </tr>
	  </thead>
	  <tbody>
	<c:forEach items="${list }" var="billiard">
	<tr align="center">
			<th scope="row">${billiard.num }</th>
			<td valign="middle">${billiard.bName }</td>
			<td>${billiard.address_01} ${billiard.address_02 } ${billiard.address_03} </td>
			<td>${billiard.bigCharge }</td>
			<td>${billiard.bTel }</td>
			<td><button class="btn btn-primary btn-sm" >상세보기</button></td>
		</tr>
	</c:forEach>
	<br>
	</tbody>
	</table>
</div>
		<c:forEach items="${pageStartList }" var="pageIndex" varStatus="status">
		<a href="billiardList?start=${pageIndex }">${status.index +1 }</a>
	</c:forEach>
</body>
</html>