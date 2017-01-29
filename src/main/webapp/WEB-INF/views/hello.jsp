<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="pageHeader.jsp" />
<body>
	<div id="container">

		<jsp:include page="header.jsp" />

		<div id="content">
			<div id="body">

				<h1>
					Hello <b><c:out value="${pageContext.request.remoteUser}" /></b>
				</h1>
				        
				<form action="/logout" method="post">
					            <input type="submit" value="Sign Out"
						class="btn btn-primary" />             <input type="hidden"
						name="${_csrf.parameterName}" value="${_csrf.token}" />         
				</form>
			</div>
			<jsp:include page="advertisment.jsp" />
		</div>
	</div>
	
	<jsp:include page="footer.jsp" />
</body>
</html>
