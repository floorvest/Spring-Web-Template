<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<jsp:include page="template/header.jsp"/>

<div class="container mt-5">
	<table class="table table-bordered">
		<tr>
			<th>ID</th>
			<th>Nama</th>
			<th>Alamat</th>
		</tr>
		<c:forEach items="${karyawan}" var="item">
		<tr>
			<td>${item.getId()}</td>
			<td>${item.getNama()}</td>
			<td>${item.getAlamat()}</td>
		</tr>
		</c:forEach>
	</table>
      
</div><!--/.container-->
<jsp:include page="template/footer.jsp"/>
