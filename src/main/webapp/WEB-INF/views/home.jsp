<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="pageHeader.jsp" />
<body>
	<div id="container">

		<jsp:include page="header.jsp" />

		<div id="body">
			<jsp:include page="advertisment.jsp" />
			<h1>Welcome!</h1>
			<p>
				Click <a href="<spring:url value='/hello' />"
					class=" btn btn-default">here</a> to see a greeting.
			</p>
		</div>

	<jsp:include page="footer.jsp" />
	</div>
</body>
</html>
