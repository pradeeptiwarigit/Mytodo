<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
.alert i[class^="bi-"]{
  font-size: 1.5em;
  line-height: 1;
}
</style>


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			
			<div>
				<a href="https://www.javaguides.net" class="navbar-brand"> Todo
					App</a>
			</div>
			
				<div class="navbar-nav navbar-collapse justify-content-center">
				<h2 class="text-white">Welcome ${user}
					</h2> 
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Todos</a></li>
			</ul>

			<ul class="navbar-nav navbar-collapse justify-content-end">
				<li><a href="<%=request.getContextPath()%>/logout"
					class="nav-link">Logout</a></li>
			</ul>
		</nav>
	</header>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Todos</h3>
			<hr>
			<div class="container text-left">

				<a href="todoform"
					class="btn btn-success">Add Todo</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Title</th>
						<th>Target Date</th>
						<th>Todo Status</th>
						<th>Todo Description</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				<c:if test="${detail.equals('al')}">
					
		<div class="alert alert-success">
  <strong>Success!</strong> Todo SuccessFully Added
          <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
  
</div>
					
				
				
				</c:if>
					<!--   for (Todo todo: todos) {  -->

					<%-- 	<tr>
							<td><c:out value="${detail.get(0)}" /></td>
							<td><c:out value="${detail.get(1)}" /></td>
							<td><c:out value="${detail.get(2)}" /></td>
							<td><c:out value="${detail.get(1)}" /></td>
							
							<td><a href="edit?id=<c:out value='' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='' />">Delete</a></td>

							<!--  <td><button (click)="updateTodo(todo.id)" class="btn btn-success">Update</button>
          							<button (click)="deleteTodo(todo.id)" class="btn btn-warning">Delete</button></td> -->
						</tr> --%>
				
					<!-- } -->
			<c:forEach items="${Allrecord}" var="employee">
    <tr>
        <td> <c:out value="${employee.todo_title}"/></td>
        <td> <c:out value="${employee.date}"/></td>  
          <td> <c:out value="${employee.todo_status}"/></td>
           <td> <c:out value="${employee.todo_desc}"/></td>
          	<td><a href="edit?id=<c:out value='' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='' />">Delete</a></td>

						 
    </tr>
</c:forEach>		
					
					
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>
