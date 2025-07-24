<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>

<script type="text/javascript">
function deleteStudent()
{
	alert("Delete function ...!!");
	document.fn.action="delete";
	document.fn.submit();
}

function editStudent()
{
	alert("Edit function ...!!");
	document.fn.action="edit";
	document.fn.submit();
}
</script>

</head>
<body>
	<h1>LOGIN SUCCESS </h1>
	
	<form name="fn">
	<table class="table table-hover table-bordered">
  <thead>
    <tr>
      <th scope="col">Select</th>
      <th scope="col">Roll No.</th>
      <th scope="col">Name</th>
      <th scope="col">Contact</th>
      <th scope="col">Marks</th>
      <th scope="col">Username</th>
      <th scope="col" colspan="2">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${students}" var="s">
    <tr>
      <td> <input type="radio" name="rollno" value="${s.rollno}"> </td>
      <th scope="row">${s.rollno}</th>
      <td>${s.sname}</td>
      <td>${s.contact}</td>
      <td>${s.marks}</td>
      <td>${s.username}</td>
      <td> <button onclick="deleteStudent()">DELETE</button> </td>
      <td> <button onclick="editStudent()">EDIT</button> </td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</form>
</body>
</html>